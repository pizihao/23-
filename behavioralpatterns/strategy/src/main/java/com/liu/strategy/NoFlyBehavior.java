package com.liu.strategy;

/**
 * @author shidacaizi
 * @date 2020/6/1 18:20
 */
public class NoFlyBehavior implements FLyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子不会飞");
    }
}
