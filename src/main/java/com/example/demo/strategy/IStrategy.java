/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.strategy;

/**
 * 策略模式定义了一组算法，将每个算法都封装起来，且它们之间可以互换。
 *
 * IStrategy是策略的抽象接口，operate封装了每个具体策略的算法
 */
public interface IStrategy {
    void operate();
}
