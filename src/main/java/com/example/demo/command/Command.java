/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.command;

/**
 * 命令角色，抽象成要执行的命令
 *
 * 将一个请求封装成一个命令对象，
 */
public interface Command {
    void execute();
}
