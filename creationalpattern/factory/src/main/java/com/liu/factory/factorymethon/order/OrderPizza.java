package com.liu.factory.factorymethon.order;

import com.liu.factory.factorymethon.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shidacaizi
 * @date 2020/5/14 12:03
 */
public abstract class OrderPizza {

    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        //订购披萨的类型
        String orderType;
        do {
            orderType = gettype();
            //抽象方法，由工厂子类完成
            pizza = createPizza(orderType);
            //输出披萨的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    //定义一个抽象方法，createPizza,让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //写一个方法，可以获取客户希望订购的披萨种类
    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
