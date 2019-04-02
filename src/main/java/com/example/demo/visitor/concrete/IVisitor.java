/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor.concrete;

public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
