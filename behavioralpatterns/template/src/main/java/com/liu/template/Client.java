package com.liu.template;

/**
 * @author shidacaizi
 * @date 2020/5/28 12:53
 */
public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        System.out.println("===制作红豆豆浆===");
        SoyaMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();
        //制作花生豆浆
        System.out.println("===制作花生豆浆===");
        SoyaMilk  peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
        //制作纯豆浆
        System.out.println("===制作纯豆浆===");
        SoyaMilk  pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
