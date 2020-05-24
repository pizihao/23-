package com.liu.decorator;

/**
 * @author shidacaizi
 * @date 2020/5/24 17:56
 */
public class Decorator extends Dink {
    private Dink obj;

    public Decorator(Dink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice 自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes()被装饰者的信息
        return super.getDes() +""+super.getPrice()+" && "+ obj.getDes();
    }
}
