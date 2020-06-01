package com.liu.strategy;

/**
 * @author shidacaizi
 * @date 2020/6/1 18:20
 */
public class GoodFlyBehavior  implements FLyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子飞的很好");
    }
}
