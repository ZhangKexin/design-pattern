/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder.concrete;

import java.util.List;

public class BenzCarBuilder extends CarBuilder {

    private CarModel benzModel = new BenzModel();

    @Override
    void setSequence(List<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    CarModel getCarModel() {
        return benzModel;
    }
}
