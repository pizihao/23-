package com.liu.singleresponsibility.single03;

/**
 * @author shidacaizi
 * @date 2020/5/12 20:01
 */
public class Vehicle {

    public void run(String str){
        System.out.println(str + "在公路上运行");
    }

    public void runAir(String str){
        System.out.println(str + "在天空上运行");
    }

    public void runWater(String str){
        System.out.println(str + "在水中运行");
    }
}
