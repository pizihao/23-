package com.liu.decorator;

/**
 * @author shidacaizi
 * @date 2020/5/24 18:07
 */
//具体的Decorator 这里就是调味品
public class Chocolate  extends  Decorator{
    public Chocolate(Dink obj) {
        super(obj);
        setDes("巧克力");
        //调味品的价格
        setPrice(3.0f);
    }
}
