package com.liu.strategy;

/**
 * @author shidacaizi
 * @date 2020/6/1 18:21
 */
public abstract class Duck {

    //属性，策略接口
    FLyBehavior fLyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void fly(){
        if (fLyBehavior != null){
            fLyBehavior.fly();
        }
    }
}
