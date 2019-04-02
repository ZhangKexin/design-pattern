/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod.simplefactory;

import com.example.demo.factorymethod.Product;

public class SimpleFactory {
    // 简单工厂模式，只有一个工厂类，不需要其他的工厂类，也就不需要工厂接口，只需要一个具体实现，静态方法
    public static <T extends Product> T createProduct(Class<T> cls) {
        Product product = null;
        try {
            product = (Product) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
