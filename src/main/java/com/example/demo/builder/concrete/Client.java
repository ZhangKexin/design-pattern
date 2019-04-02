/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder.concrete;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> sequence = Arrays.asList("start", "alarm", "stop");

        CarBuilder benzCarBuilder = new BenzCarBuilder();
        benzCarBuilder.setSequence(sequence);
        CarModel benzModel = benzCarBuilder.getCarModel();
        benzModel.run();

        CarBuilder bmwCarBuilder = new BmwCarBuilder();
        bmwCarBuilder.setSequence(sequence);
        CarModel bmwModel = bmwCarBuilder.getCarModel();
        bmwModel.run();
    }
}
