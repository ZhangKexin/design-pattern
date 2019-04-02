/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod.multifactory;

import com.example.demo.factorymethod.ConcreteProduct2;
import com.example.demo.factorymethod.Product;

/**
 * 具体工厂2只生产产品2
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
