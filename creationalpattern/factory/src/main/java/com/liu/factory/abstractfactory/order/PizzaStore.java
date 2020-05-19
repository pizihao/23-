package com.liu.factory.abstractfactory.order;

/**
 * @author shidacaizi
 * @date 2020/5/19 22:07
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
