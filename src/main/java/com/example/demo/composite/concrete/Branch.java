/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.composite.concrete;

import java.util.ArrayList;
import java.util.List;

public class Branch extends ICorp {
    List<ICorp> subordinateList = new ArrayList<>();

    public void addSubordinate(ICorp corp) {
        subordinateList.add(corp);
    }

    public List getSubordinate() {
        return subordinateList;
    }

}
