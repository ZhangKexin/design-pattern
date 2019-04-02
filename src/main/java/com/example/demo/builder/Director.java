/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder;

import com.example.demo.templatemethod.AbstractClass;

public class Director {
    private Builder builder1 = new ConcreteBuilder1();
    private Builder builder2 = new ConcreteBuilder2();

    public AbstractClass get1Product() {
        builder1.setPart();
        return builder1.buildProduct();
    }

    public AbstractClass get2Product() {
        builder1.setPart();
        return builder2.buildProduct();
    }

}
