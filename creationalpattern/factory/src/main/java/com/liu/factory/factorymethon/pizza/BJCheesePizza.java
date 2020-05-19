package com.liu.factory.factorymethon.pizza;

/**
 * @author shidacaizi
 * @date 2020/5/19 15:02
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京的奶酪披萨 准备原材料");
    }
}
