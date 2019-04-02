/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.abstractfactory;

/**
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无须指定他们的具体类
 * <p>
 * 有N个产品族，在抽象工厂类中就有N个创建方法。A和B
 *
 * 有M个产品等级，就有M个实现工厂类，每个实现工厂中，实现不同产品族的生产。method1和method2
 */
public interface Factory {
    Product createProductA();

    Product createProductB();
}
