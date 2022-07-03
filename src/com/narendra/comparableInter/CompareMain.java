package com.narendra.comparableInter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Narendra", 60000),
                new Employee(104, "Chathurya", 75000),
                new Employee(102, "Rajasekhar", 30000),
                new Employee(106, "Janardhan", 55000),
                new Employee(107, "Damodar", 45000),
                new Employee(103, "Mallikarjuna", 95000),
                new Employee(105, "Potti", 85000)
        );

        Collections.sort(employeeList);
        System.out.println(employeeList);

    }
}
