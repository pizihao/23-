package com.liu.mediator;

/**
 * @author shidacaizi
 * @date 2020/5/31 17:06
 */
public abstract class Mediator {
    //将中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接受消息，具体的对象发出的
    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
