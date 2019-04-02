/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod.simplefactory;

import com.example.demo.factorymethod.ConcreteProduct1;
import com.example.demo.factorymethod.ConcreteProduct2;
import com.example.demo.factorymethod.Product;

public class Client {
    public static void main(String[] args) {
        Product product1 = SimpleFactory.createProduct(ConcreteProduct1.class);
        product1.method1();
        product1.method2();
        Product product2 = SimpleFactory.createProduct(ConcreteProduct2.class);
        product2.method1();
        product2.method2();
    }
}
