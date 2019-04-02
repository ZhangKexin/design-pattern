/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式，待续，
 */
// TODO: 2019/4/2  
public class Client {
    public static void main(String[] args) {
        List<IProject> projectList = new ArrayList<>();

        IProjectIterator projectIterator = new ProjectIterator(projectList);
        while (projectIterator.hasNext()){
            IProject project = (IProject) projectIterator.next();
            System.out.println(project.getProjectInfo());
        }
    }
}
