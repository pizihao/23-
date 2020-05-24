package com.liu.decorator;

/**
 * @author shidacaizi
 * @date 2020/5/24 18:18
 */
public class Soy extends  Decorator{
    public Soy(Dink obj) {
        super(obj);
        setDes("豆浆");
        //调味品的价格
        setPrice(2.5f);
    }
}