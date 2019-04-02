/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor.concrete;

public class Manager extends Employee {
    private String performance;

    public Manager(String name, int salary, int sex, String performance) {
        super(name, salary, sex);
        this.performance = performance;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
