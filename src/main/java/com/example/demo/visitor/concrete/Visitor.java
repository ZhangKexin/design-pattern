/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor.concrete;

public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        return employee.getName() + ", " + employee.getSalary() + ", " + employee.getSex() + ", ";
    }

    private String getCommonEmployeeInfo(CommonEmployee employee) {
        return getBasicInfo(employee) + employee.getJob();
    }

    private String getManagerInfo(Manager manager) {
        return getBasicInfo(manager) + manager.getPerformance();
    }
}
