package com.liu.decorator;

/**
 * @author shidacaizi
 * @date 2020/5/24 17:51
 */
public class Coffee extends Dink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
