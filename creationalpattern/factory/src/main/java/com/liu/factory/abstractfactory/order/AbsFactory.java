package com.liu.factory.abstractfactory.order;

import com.liu.factory.abstractfactory.pizza.Pizza;

/**
 * @author shidacaizi
 * @date 2020/5/19 21:12
 */
// 一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    // 让下边的工厂子类来具体实现
    public Pizza createPizza(String orderType);

}
