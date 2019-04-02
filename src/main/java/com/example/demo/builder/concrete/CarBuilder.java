/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder.concrete;

import java.util.List;

/**
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 */
public abstract class CarBuilder {

    abstract void setSequence(List<String> sequence);

    abstract CarModel getCarModel();
}
