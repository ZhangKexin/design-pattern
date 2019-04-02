/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.facade.concrete;

/**
 * 外观模式Facade，要求一个子系统的外部和其内部的通信必须通过一个统一的对象进行
 */
public class Client {
    public static void main(String[] args) {
       PostOffice postOffice = new PostOffice();
       postOffice.sendLetter("helloworld", "666");
    }
}