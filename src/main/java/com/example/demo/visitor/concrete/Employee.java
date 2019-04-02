/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor.concrete;

public abstract class Employee {
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private String name = "";
    private int salary;
    private int sex;

    public Employee() {
    }

    public Employee(String name, int salary, int sex) {
        this.name = name;
        this.salary = salary;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public abstract void accept(IVisitor visitor);
}
