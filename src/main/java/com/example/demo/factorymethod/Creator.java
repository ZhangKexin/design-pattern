/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod;

public abstract class Creator {
    // 创建产品对象
    public abstract <T extends Product> T createProduct(Class<T> cls);

}
