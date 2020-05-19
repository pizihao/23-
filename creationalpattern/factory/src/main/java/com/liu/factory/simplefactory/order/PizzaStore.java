package com.liu.factory.simplefactory.order;

/**
 * @author shidacaizi
 * @date 2020/5/14 12:18
 */
//相当于一个客户端，发起订购
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();

        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("完成");
    }
}
