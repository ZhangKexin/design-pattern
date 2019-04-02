/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder;

import com.example.demo.templatemethod.AbstractClass;
import com.example.demo.templatemethod.ConcreteClass2;

public class ConcreteBuilder2 extends Builder {

    private AbstractClass product = new ConcreteClass2();

    @Override
    public void setPart() {
        // 组装产品
    }

    @Override
    public AbstractClass buildProduct() {
        return product;
    }
}
