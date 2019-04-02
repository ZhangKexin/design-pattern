/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝(组合)对象，组合树枝节点和叶子节点成树形结构
 */
public class Composite extends Component {

    List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        this.componentList.add(component);
    }

    public void remove(Component component) {
        this.componentList.remove(component);
    }

    public List<Component> getChildren() {
        return this.componentList;
    }
}
