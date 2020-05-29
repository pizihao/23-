package com.liu.command;

/**
 * @author shidacaizi
 * @date 2020/5/28 18:53
 */
//没有任何命令，即空执行，用于初始化每个按钮 当调用命令为空时，什么都不做
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
