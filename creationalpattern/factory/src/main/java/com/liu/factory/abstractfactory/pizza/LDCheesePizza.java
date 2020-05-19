package com.liu.factory.abstractfactory.pizza;

/**
 * @author shidacaizi
 * @date 2020/5/19 15:22
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦的奶酪披萨 准备原材料");
    }
}
