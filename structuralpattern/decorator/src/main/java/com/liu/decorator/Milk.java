package com.liu.decorator;

/**
 * @author shidacaizi
 * @date 2020/5/24 18:17
 */
public class Milk extends  Decorator{
    public Milk(Dink obj) {
        super(obj);
        setDes("牛奶");
        //调味品的价格
        setPrice(3.5f);
    }
}