package com.liu.mediator;

/**
 * @author shidacaizi
 * @date 2020/5/31 17:06
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
    public void startTv(){
        System.out.println("TV start");
    }

    public void stopTv(){
        System.out.println("TV stop");
    }
}
