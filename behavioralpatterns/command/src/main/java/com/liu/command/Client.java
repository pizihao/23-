package com.liu.command;

/**
 * @author shidacaizi
 * @date 2020/5/28 20:21
 */
public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对点灯的操作
        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteConteoller remoteConteoller = new RemoteConteoller();

        remoteConteoller.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("-------按下灯的开的按钮-------");
        remoteConteoller.onButtonWasPushed(0);
        System.out.println("-------按下灯的关的按钮-------");
        remoteConteoller.offButtonWasPushed(0);
        System.out.println("-------按下灯的撤销的按钮-------");
        remoteConteoller.undoButtonWasPushed();

    }
}
