package com.liu.command;

/**
 * @author shidacaizi
 * @date 2020/5/28 18:49
 */
public class LightOffCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;

    //构造器
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.on();
    }
}
