/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.abstractfactory;

public class Method2Factory implements Factory {
    @Override
    public Product createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public Product createProductB() {
        return new ConcreteProductB2();
    }
}
