/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor;

public class Client {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            Element element = ObjectStructure.createElement();
            element.accept(new ConcreteVisitor());
        }
    }
}
