/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor.concrete;

public class CommonEmployee extends Employee {

    private String job;

    public CommonEmployee(String name, int salary, int sex, String job) {
        super(name, salary, sex);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
