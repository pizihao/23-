package com.liu.dependenceinversion.dependence01;

/**
 * @author shidacaizi
 * @date 2020/5/12 21:33
 */
/*
* 完成Person接受消息的功能
* 方式一
* 1，简单，比较容易想到
* 2，如果我们获取的对象是其他的，则新增类，同时Person也要增加相应的介绍
* 3，解决思路：引入一个抽象的接口Ireceiver，表示接收者，这样Person类与接口发生依赖
* 4，因为Email, WeiXin等等属于接收的范围，他们各自实现IReceiver接口就ok,这样我们就符合依赖倒转原则
 * */

public class Person {
   public void  receive(IReceiver iReceiver){
       System.out.println(iReceiver.getInfo());
   }
}
