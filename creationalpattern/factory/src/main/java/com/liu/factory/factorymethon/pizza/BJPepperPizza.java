package com.liu.factory.factorymethon.pizza;

/**
 * @author shidacaizi
 * @date 2020/5/19 15:12
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨 准备原材料中");
    }
}
