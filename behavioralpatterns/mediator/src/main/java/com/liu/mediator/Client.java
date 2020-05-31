package com.liu.mediator;

/**
 * @author shidacaizi
 * @date 2020/5/31 17:06
 */
public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();
        //创建一个Alarm 将自己加入到ConcreteMediator中
        Alarm alarm = new Alarm(mediator,"Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator , "CoffeeMachine");
        Curtains curtains = new Curtains (mediator, "Curtains");
        TV tV = new TV(mediator, "TV");
        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm. SendAlarm(1);

    }
}
