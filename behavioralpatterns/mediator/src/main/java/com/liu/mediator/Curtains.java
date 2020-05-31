package com.liu.mediator;

/**
 * @author shidacaizi
 * @date 2020/5/31 17:06
 */
public class Curtains  extends Colleague{
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void upCurtains(){
        System.out.println("I am holding Up Curtains");
    }
}
