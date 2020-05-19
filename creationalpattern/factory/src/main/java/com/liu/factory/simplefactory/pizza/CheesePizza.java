package com.liu.factory.simplefactory.pizza;

/**
 * @author shidacaizi
 * @date 2020/5/14 12:02
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备做奶酪披萨的原材料");
    }
}
