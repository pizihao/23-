package com.liu.singleton.type05;

/**
 * @author shidacaizi
 * @date 2020/5/14 8:45
 */
public class Singleton_05 {
    public static void main(String[] args) {
//        测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}

//懒汉式(线程安全,同步代码块)
class Singleton {
    //静态私有声明
    private static Singleton singleton;
    //私有构造器
    private Singleton(){}
    //当调用的时候才会创建实例对象，
    //使用synchronized关键字上锁，线程同步
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized(Singleton.class){
                singleton =  new Singleton();
            }
        }
        return singleton;
    }
}
