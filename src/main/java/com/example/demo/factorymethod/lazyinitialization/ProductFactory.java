/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod.lazyinitialization;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.factorymethod.ConcreteProduct1;
import com.example.demo.factorymethod.ConcreteProduct2;
import com.example.demo.factorymethod.Product;

/**
 * Product 消费后不释放，放入premap中缓存其初始状态，可以再次被使用
 */
public class ProductFactory {

    private static final Map<String, Product> prMap = new HashMap<>();

    private static synchronized Product createProduct(String type) {
        Product product = null;
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if ("Product1".equals(type)) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            prMap.put(type, product);
        }
        return product;
    }
}
