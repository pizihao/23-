package com.liu.decorator;

/**
 * @author shidacaizi
 * @date 2020/5/24 18:19
 */
public class CoffeeClient {
    public static void main(String[] args) {
        //装饰者模式下的订单 2份巧克力+一份牛奶的LongBlack
        //点一份LongBack
        Dink dink = new LongBack();
//        System.out.println("费用1=" + dink.cost());
//        System.out.println("描述"+dink.getDes());

        //加入一份牛奶
        dink = new Milk(dink);
//        System.out.println("dink加入一份牛奶费用" + dink.cost());
//        System.out.println("描述"+dink.getDes());

        //加入一份巧克力
        dink = new Chocolate(dink);
//        System.out.println("dink加入一份牛奶和一份巧克力费用" + dink.cost());
//        System.out.println("描述"+dink.getDes());

        //加入一份巧克力
        dink = new Chocolate(dink);
        System.out.println("dink加入一份牛奶和两份巧克力费用" + dink.cost());
        System.out.println("描述"+dink.getDes());
    }
}
