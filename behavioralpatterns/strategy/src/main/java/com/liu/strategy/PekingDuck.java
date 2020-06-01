package com.liu.strategy;

/**
 * @author shidacaizi
 * @date 2020/6/1 18:21
 */
public class PekingDuck extends Duck{

    public PekingDuck() {
        fLyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
