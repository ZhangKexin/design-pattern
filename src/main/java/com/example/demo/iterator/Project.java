/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.iterator;

import java.util.ArrayList;
import java.util.List;

public class Project implements IProject {

    private List<IProject> projectList = new ArrayList<>();

    String name;
    int num;
    int cost;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        return "project info";
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(projectList);
    }
}
