package com.liu.facade;

/**
 * @author shidacaizi
 * @date 2020/5/26 9:11
 */
public class Stereo {
    //使用单例模式，使用饿汉式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void up(){
        System.out.println("Stereo up");
    }

    public void down(){
        System.out.println("Stereo down");
    }
}
