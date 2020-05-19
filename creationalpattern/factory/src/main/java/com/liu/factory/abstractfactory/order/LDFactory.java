package com.liu.factory.abstractfactory.order;

import com.liu.factory.abstractfactory.pizza.*;

/**
 * @author shidacaizi
 * @date 2020/5/19 21:51
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
