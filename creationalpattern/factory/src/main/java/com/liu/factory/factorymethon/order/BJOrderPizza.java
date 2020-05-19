package com.liu.factory.factorymethon.order;

import com.liu.factory.factorymethon.pizza.BJCheesePizza;
import com.liu.factory.factorymethon.pizza.BJPepperPizza;
import com.liu.factory.factorymethon.pizza.Pizza;

/**
 * @author shidacaizi
 * @date 2020/5/19 20:52
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else  if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
