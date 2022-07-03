package com.narendra.immutable;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeMainTwo {

    public static void main(String[] args) {
        Address addressNarendra = new Address();
        addressNarendra.setAddressLine1("NG palle");
        addressNarendra.setAddressLine2("Madanapalle");
        addressNarendra.setCity("Madanapalle");
        List<String> narendraSkillls = new ArrayList<>();
        narendraSkillls.add("Java");
        narendraSkillls.add("SQL");

        EmployeeTwo employeeTwo = new EmployeeTwo(101, "Narendra", new BigDecimal(15000.00), getDate("19/06/1996"), addressNarendra, narendraSkillls);

        ConcurrentHashMap<EmployeeTwo, Integer> map = new ConcurrentHashMap<>();
        map.put(employeeTwo, 1);

        Set<Map.Entry<EmployeeTwo, Integer>> entrySet = map.entrySet();
        for (Map.Entry<EmployeeTwo, Integer> set : entrySet) {
            EmployeeTwo emp = set.getKey();
            System.out.println(emp.getName());
            System.out.println(emp.getAddress());
            System.out.println(emp.getSkills());
        }

        System.out.println("---------------------------");
        employeeTwo.getAddress().setCity("Bangalore");

        employeeTwo.getSkills().add("Spring");
        System.out.println(employeeTwo);

    }

    private static Date getDate(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
