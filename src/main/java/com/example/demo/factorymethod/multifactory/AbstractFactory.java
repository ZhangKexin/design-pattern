/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod.multifactory;

import com.example.demo.factorymethod.Product;

/**
 * 抽象工厂类，有多个实现类负责各自产品的生产
 */
public abstract class AbstractFactory {
    /**
     * 抽象创建方法不再需要参数，由各自具体工厂决定创建的产品
     *
     * @return
     */
    public abstract Product createProduct();
}
