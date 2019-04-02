/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProjectIterator implements IProjectIterator {
    private List<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        if (currentItem >= projectList.size() || projectList.get(currentItem) == null) {
            return false;
        }
        return true;
    }

    @Override
    public IProject next() {
        return projectList.get(currentItem++);
    }
}
