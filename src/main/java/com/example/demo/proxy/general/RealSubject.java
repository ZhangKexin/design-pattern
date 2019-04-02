/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.general;

import com.example.demo.proxy.Subject;

public class RealSubject implements Subject {
    private String name = "";

    public RealSubject(Subject subject, String name) throws Exception {
        if (subject == null) {
            throw new Exception("不能创建真实主题");
        } else {
            this.name = name;
        }
    }

    @Override
    public void request() {
        System.out.println("realsubject request");
    }
}
