/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.adapter;

/**
 * 将一个类接口变换成用户期待的另一个类接口，使原本因类接口不匹配而无法在一起工作的两个类能够在一起工作。
 * <p>
 * 适配器：把源角色Adaptee 转换成目标角色Target
 * <p>
 * Adapter extends Adaptee，继承关系，是 类适配器
 * 如果Adapter与Adaptee是关联关系，则是 对象适配器
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        // 实现了功能的转换
        super.doSomething();
    }
}
