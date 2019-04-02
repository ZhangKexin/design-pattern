/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder.concrete;

import java.util.ArrayList;
import java.util.List;

public class Director {
    List<String> sequence = new ArrayList<>();
    CarBuilder benzCarBuilder = new BenzCarBuilder();
    CarBuilder bmwCarBuilder = new BmwCarBuilder();

    public CarModel getABenzCarModel() {
        return null;
    }

    public CarModel getBBenzCarModel() {
        return null;
    }

    public CarModel getABmwCarModel() {
        return null;
    }

    public CarModel getBBmwCarModel() {
        return null;
    }

}
