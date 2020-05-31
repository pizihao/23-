package com.liu.mediator;

/**
 * @author shidacaizi
 * @date 2020/5/31 17:05
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void StartCoffee() {
        System.out.println("Coffee Start");
    }

    public void FinishCoffee() {
        System.out.println("Coffee Finish");
    }
}
