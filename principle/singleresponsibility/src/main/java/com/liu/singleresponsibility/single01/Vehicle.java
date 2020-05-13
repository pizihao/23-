package com.liu.singleresponsibility.single01;

/**
 * @author shidacaizi
 * @date 2020/5/12 19:00
 */

// 交通工具类
//  方式1
//   1，在方式一种run方法中，违反了单一职责原则
//   2，解决的方案非常简单，
//   根据交通工具运行方法不同分解成不同的类即可
public class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}
