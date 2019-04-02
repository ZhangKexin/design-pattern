/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.iterator;

public interface IProject {

    void add(String name, int num, int cost);

    String getProjectInfo();

    IProjectIterator iterator();
}
