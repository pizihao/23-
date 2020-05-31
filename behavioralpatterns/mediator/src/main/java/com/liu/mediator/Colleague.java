package com.liu.mediator;

/**
 * @author shidacaizi
 * @date 2020/5/31 17:05
 */
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public  abstract void SendMessage(int stateChange);
}
