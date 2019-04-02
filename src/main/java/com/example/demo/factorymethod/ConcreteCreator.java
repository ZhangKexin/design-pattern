/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod;

public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> cls) {
        Product product = null;
        try {
            product = (Product) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
