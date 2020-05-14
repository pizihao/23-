package com.liu.singleton.type03;

/**
 * @author shidacaizi
 * @date 2020/5/14 8:45
 */
public class Singleton_03 {
    public static void main(String[] args) {
//        测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}

//懒汉式(线程不安全)
class Singleton {
    //静态私有声明
    private static Singleton singleton;
    //私有构造器
    private Singleton(){}
    //当调用的时候才会创建实例对象
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton =  new Singleton();
        }
        return singleton;
    }
}
