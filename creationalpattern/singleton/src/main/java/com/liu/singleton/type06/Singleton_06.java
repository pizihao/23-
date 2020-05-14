package com.liu.singleton.type06;

/**
 * @author shidacaizi
 * @date 2020/5/14 8:45
 */
public class Singleton_06 {
    public static void main(String[] args) {
//        测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}

//双重检查
class Singleton {
    //静态私有声明，使用volatile关键字
    private static volatile Singleton singleton;
    //私有构造器
    private Singleton(){}
    //当调用的时候才会创建实例对象，
    //使用synchronized关键字上锁，线程同步，双重检查
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized(Singleton.class){
                if (singleton == null) {
                    singleton =  new Singleton();
                }
            }
        }
        return singleton;
    }
}
