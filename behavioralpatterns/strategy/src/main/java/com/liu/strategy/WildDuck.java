package com.liu.strategy;

/**
 * @author shidacaizi
 * @date 2020/6/1 18:22
 */
public class WildDuck extends Duck {

    //构造器，传入FlyBehavior的对象
    public WildDuck(){
        fLyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
