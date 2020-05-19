package com.liu.factory.simplefactory.order;

import com.liu.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shidacaizi
 * @date 2020/5/14 12:03
 */
public class OrderPizza {
    //构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        //订购披萨的类型
//        String orderType;
//        do {
//            orderType = gettype();
//            if (orderType.equals("greek")){
//                pizza = new GreekPizz();
//                pizza.setName(" 希腊披萨 ");
//            }else if (orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName(" 奶酪披萨 ");
//            }else{
//                break;
//            }
//            //输出制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        //用户输入
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do {
            orderType = gettype();
            pizza = this.simpleFactory.createPizza(orderType);
            //输出Pizza的信息
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有这种Pizza");
                break;
            }
        } while (true);
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
