package com.liu.facade;

/**
 * @author shidacaizi
 * @date 2020/5/26 8:54
 */
public class Popcorn {
    //使用单例模式，使用饿汉式
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Pop on");
    }

    public void off(){
        System.out.println("Pop off");
    }

    public void pop(){
        System.out.println("Pop is poping");
    }
}
