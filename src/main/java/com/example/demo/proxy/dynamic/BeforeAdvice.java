/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.dynamic;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("执行前置增强");
    }
}
