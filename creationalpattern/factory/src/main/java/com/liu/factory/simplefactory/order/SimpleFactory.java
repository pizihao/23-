package com.liu.factory.simplefactory.order;

import com.liu.factory.simplefactory.pizza.CheesePizza;
import com.liu.factory.simplefactory.pizza.GreekPizz;
import com.liu.factory.simplefactory.pizza.Pizza;

/**
 * @author shidacaizi
 * @date 2020/5/14 13:38
 */
//简单工厂类
public class SimpleFactory {

    //根据orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza = new GreekPizz();
            pizza.setName(" 希腊披萨 ");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        }
        return pizza;
    }
}
