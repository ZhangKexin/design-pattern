/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        List<Request> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(random.nextInt(4), "walk out"));
        }
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        father.setNext(husband);
        husband.setNext(son);
        for (Request women : list) {
            father.handleMessage(women);
            //            if (women.getType() == 1) {
            //                System.out.println("-----------daughter-----------");
            //                father.handleMessage(women);
            //            } else if (women.getType() == 2) {
            //                System.out.println("------------wife----------");
            //                husband.handleMessage(women);
            //            } else if (women.getType() == 3) {
            //                System.out.println("-----------mother-----------");
            //                son.handleMessage(women);
            //            } else {
            //            }
        }
    }
}
