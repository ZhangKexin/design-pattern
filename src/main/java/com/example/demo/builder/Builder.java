/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder;

import com.example.demo.templatemethod.AbstractClass;

public abstract class Builder {
    public abstract void setPart();

    public abstract AbstractClass buildProduct();
}
