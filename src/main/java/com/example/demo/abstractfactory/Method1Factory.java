/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.abstractfactory;

public class Method1Factory implements Factory {
    @Override
    public Product createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public Product createProductB() {
        return new ConcreteProductB1();
    }
}
