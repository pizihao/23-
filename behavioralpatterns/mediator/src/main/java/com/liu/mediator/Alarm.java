package com.liu.mediator;

/**
 * @author shidacaizi
 * @date 2020/5/31 17:05
 */
//闹钟
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name){
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void SendAlarm(int stateChange){
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
