package com.liu.singleton.type08;

/**
 * @author shidacaizi
 * @date 2020/5/14 8:45
 */
public class Singleton_08 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;
        System.out.println(singleton == singleton1);
    }
}

//枚举
enum Singleton {
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}
