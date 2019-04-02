/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder.concrete;

import java.util.List;

public class BmwCarBuilder extends CarBuilder {

    private CarModel bmwModel = new BmwModel();

    @Override
    void setSequence(List<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    CarModel getCarModel() {
        return bmwModel;
    }
}
