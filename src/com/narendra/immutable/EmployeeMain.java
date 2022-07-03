package com.narendra.immutable;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1001, "Bob", new BigDecimal(9000.00), getDob("04/02/1986"));
        Employee employee2 = new Employee(1002, "Sean", new BigDecimal(40000.00), getDob("25/02/1985"));
        Employee employee3 = new Employee(1003, "Martin", new BigDecimal(60000.00), getDob("14/03/1985"));
        Employee employee4 = new Employee(1004, "Bob", new BigDecimal(95000.00), getDob("15/12/1986"));
        Employee employee5 = new Employee(1005, "Bob", new BigDecimal(95000.00), getDob("15/12/1986"));
        Employee employee6 = new Employee(1006, "Bob", new BigDecimal(95000.00), getDob("15/12/1986"));

        ConcurrentHashMap<Employee, String> empMap = new ConcurrentHashMap<>();
        empMap.put(employee1, "IT");
        empMap.put(employee2, "Finanace");
        empMap.put(employee3, "IT");
        empMap.put(employee4, "Finanace");
        empMap.put(employee5, "Finanace");
        empMap.put(employee6, "Finanace");
        Set<Map.Entry<Employee, String>> entrySet = empMap.entrySet();
        for (Map.Entry<Employee, String> entry : entrySet) {
            Employee employee = entry.getKey();
            String dept = entry.getValue();
            System.out.println(employee);
            System.out.println(dept);
        }
        System.out.println("--------------------------------------");
        employee1.getDob().setTime(8988878787L);
        System.out.println(employee1);
        System.out.println(empMap.get(employee1));
    }

    private static Date getDob(String dob) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try{
            return dateFormat.parse(dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
