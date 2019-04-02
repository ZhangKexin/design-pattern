/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.composite;

/**
 * 将对象组合成树形结构以表示"部分-整体"的层次结构，使得用户对单个对象和组合对象的使用具有一致性
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();

        Composite branch = new Composite();
        Leaf leaf = new Leaf();

        root.add(branch);
        branch.add(leaf);
    }
}
