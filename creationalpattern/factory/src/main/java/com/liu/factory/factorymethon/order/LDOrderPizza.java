package com.liu.factory.factorymethon.order;

import com.liu.factory.factorymethon.pizza.*;

/**
 * @author shidacaizi
 * @date 2020/5/19 20:52
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        } else  if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
