package com.liu.singleton.type07;

/**
 * @author shidacaizi
 * @date 2020/5/14 8:45
 */
public class Singleton_07 {
    public static void main(String[] args) {
//        测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}

//静态内部类
class Singleton {
    //私有构造器
    private Singleton(){}
    //使用静态私有内部类创建实例对象
    //放外部类被装载时内部类不会被装载
    //内部类被装载时是线程安全的
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    //返回实例对象
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
