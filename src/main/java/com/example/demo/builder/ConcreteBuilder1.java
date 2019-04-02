/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder;

import com.example.demo.templatemethod.AbstractClass;
import com.example.demo.templatemethod.ConcreteClass1;

public class ConcreteBuilder1 extends Builder {

    private AbstractClass product = new ConcreteClass1();

    @Override
    public void setPart() {
        // 组装产品
    }

    @Override
    public AbstractClass buildProduct() {
        return product;
    }
}
