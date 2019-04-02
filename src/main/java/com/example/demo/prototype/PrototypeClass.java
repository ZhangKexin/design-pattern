/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.prototype;

/**
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 即不通过new来创建新对象，而是通过对象复制来实现。
 *
 * 1. 原型模式拷贝时，构造函数不会被执行
 * 2. 浅拷贝，Object的clone方法只拷贝对象本身，内部数组、引用对象不拷贝，指向原对象中的内部数组、引用对象
 * 3. 实现深拷贝，需要对内部数组、引用对象独立拷贝
 * 4. clone方法与final关键字冲突
 */
public class PrototypeClass implements Cloneable {

    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        PrototypeClass prototypeClass = null;

        prototypeClass = (PrototypeClass) super.clone();

        return prototypeClass;
    }
}
