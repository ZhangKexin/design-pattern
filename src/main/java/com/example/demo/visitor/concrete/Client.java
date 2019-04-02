/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor.concrete;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        for (Employee employee : mockEmployee()) {
            employee.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new CommonEmployee("name1", 1, 0, "job1");
        employeeList.add(employee1);

        Employee employee2 = new Manager("name2", 2, 1, "job2");
        employeeList.add(employee2);

        return employeeList;
    }
}
