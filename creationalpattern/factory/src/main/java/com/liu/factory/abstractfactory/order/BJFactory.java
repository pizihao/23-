package com.liu.factory.abstractfactory.order;

import com.liu.factory.abstractfactory.pizza.BJCheesePizza;
import com.liu.factory.abstractfactory.pizza.BJPepperPizza;
import com.liu.factory.abstractfactory.pizza.Pizza;

/**
 * @author shidacaizi
 * @date 2020/5/19 21:45
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
