/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod.singletonfactory;

public class Client {
    public static void main(String[] args){
        Singleton singleton = SingletonFactory.getSingleton();
        singleton.doSomething();
    }
}
