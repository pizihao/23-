package com.liu.facade;

/**
 * @author shidacaizi
 * @date 2020/5/26 8:56
 */
public class Projector {
    //使用单例模式，使用饿汉式
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }

    public void off(){
        System.out.println("Projector off");
    }

    public void play(){
        System.out.println("Projector is playing");
    }

    public void focus(){
        System.out.println("Projector focus...");
    }
}
