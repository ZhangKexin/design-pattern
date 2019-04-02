/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.strategy;

/**
 * 策略枚举
 *
 * 枚举类的每个枚举成员实现抽象方法，该抽象方法对应策略模式中的算法
 */
public enum Calculator {
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    };

    private String val;

    Calculator(String s) {
        this.val = s;
    }

    abstract int exec(int a, int b);
}
