package com.liu.command;

/**
 * @author shidacaizi
 * @date 2020/5/28 18:26
 */
//创建命令接口
public interface Command {
    //执行操作(动作)
    public void execute();
    //撤销操作(动作)
    public void undo();
}
