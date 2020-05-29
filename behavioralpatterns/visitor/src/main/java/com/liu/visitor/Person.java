package com.liu.visitor;

/**
 * @author shidacaizi
 * @date 2020/5/29 13:29
 */
public abstract class Person {
    //提供一个方法让访问者可以访问
    public abstract void accpet(Action action);
}
