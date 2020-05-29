package com.liu.command;

/**
 * @author shidacaizi
 * @date 2020/5/28 19:20
 */
public class RemoteConteoller {

    //开按钮命令数组
    private Command[] onCommands;
    private Command[] offCommands;
    //执行数据的命令
    Command undoCommand;

    //构造器 完成对按钮初始化
    public RemoteConteoller(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    //给我们的按钮设置你需要的命令
    public void setCommand(int s, Command onCommand, Command offCommand){
        onCommands[s] = onCommand;
        offCommands[s] = offCommand;
    }
    //按下开的按钮
    public void onButtonWasPushed(int no){
        //找到按下的开的按钮，并调用对应的方法
        onCommands[no].execute();
        //记录这次操作,用于撤销
        undoCommand = onCommands[no];
    }
    //按下开的按钮
    public void offButtonWasPushed(int no){
        //找到按下的关的按钮，并调用对应的方法
        offCommands[no].execute();
        //记录这次操作,用于撤销
        undoCommand = offCommands[no];
    }
    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
