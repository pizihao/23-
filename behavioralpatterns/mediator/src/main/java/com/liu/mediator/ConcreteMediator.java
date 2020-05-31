package com.liu.mediator;

import java.util.HashMap;

/**
 * @author shidacaizi
 * @date 2020/5/31 17:05
 */
public class ConcreteMediator extends Mediator {

    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> stringMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        stringMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof  Alarm){
            stringMap.put("Alarm", colleagueName);
        }else if (colleague instanceof CoffeeMachine){
            stringMap.put("CoffeeMachine", colleagueName);
        }else if (colleague instanceof  TV){
            stringMap.put("TV", colleagueName);
        }else if (colleague instanceof Curtains){
            stringMap.put("Curtains", colleagueName);
        }
    }

    //具体中介着的核心方法
    //根据得到的消息，完成对应的方法
    //中介者在这个方法中，协调各个具体的类
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm){
            if (stateChange == 0){
                ((CoffeeMachine)(colleagueMap.get(stringMap.get("CoffeeMachine")))).StartCoffee();
                ((TV)(colleagueMap.get(stringMap.get("TV")))).startTv();
            }else if (stateChange == 1){
                ((TV)(colleagueMap.get(stringMap.get("TV")))).stopTv();
            }
        }else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine){
            ((Curtains)(colleagueMap.get(stringMap.get("Curtains")))).upCurtains();
        }else if (colleagueMap.get(colleagueName) instanceof TV){
            //处理待定
        }else if (colleagueMap.get(colleagueName) instanceof Curtains){
            //处理待定
        }
    }

    @Override
    public void SendMessage() {

    }
}
