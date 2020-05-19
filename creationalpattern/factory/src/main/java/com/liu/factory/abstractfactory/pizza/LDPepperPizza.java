package com.liu.factory.abstractfactory.pizza;

/**
 * @author shidacaizi
 * @date 2020/5/19 15:14
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦的胡椒披萨 准备原材料");
    }
}
