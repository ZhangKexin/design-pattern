/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod.multifactory;

import com.example.demo.factorymethod.ConcreteProduct1;
import com.example.demo.factorymethod.Product;

/**
 * 具体工厂1只生产产品1
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
