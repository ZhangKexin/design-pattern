/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod;

public abstract class Product {
    //    产品类的公共方法
    public void method1() {
        System.out.println("公共方法method1");
    }
    // 抽象方法，具体产品逻辑
    public abstract void method2();
}
