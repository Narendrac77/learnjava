package com.narendra.comparableInter;

import java.util.*;

public class CompareMainTwo {
    public static void main(String[] args) {
        List<EmployeeTwo> employeeList = Arrays.asList(
                new EmployeeTwo(101, "Narendra", 60000),
                new EmployeeTwo(104, "Chathurya", 75000),
                new EmployeeTwo(102, "Rajasekhar", 30000),
                new EmployeeTwo(106, "Janardhan", 55000),
                new EmployeeTwo(107, "Damodar", 45000),
                new EmployeeTwo(103, "Mallikarjuna", 95000),
                new EmployeeTwo(105, "Potti", 85000)
        );
        Comparator<EmployeeTwo> comparator = new Comparator<EmployeeTwo>() {
            @Override
            public int compare(EmployeeTwo o1, EmployeeTwo o2) {
                if(o1.getEmployeeId() > o2.getEmployeeId()){
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(employeeList, comparator);
       System.out.println(employeeList);
        Collections.reverseOrder();
        System.out.println(employeeList);




    }

}
