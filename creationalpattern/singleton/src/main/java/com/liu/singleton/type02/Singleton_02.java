package com.liu.singleton.type02;

/**
 * @author shidacaizi
 * @date 2020/5/14 8:45
 */
public class Singleton_02 {
    public static void main(String[] args) {
//        测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}

//饿汉式(静态代码块)
class Singleton {
    // 1，构造器私有化,外部不能new了
    private Singleton(){}
    // 2，在本类内部创建对象实例
    private  static Singleton instance;
    //在静态代码块中创建单例对象
    static {
        instance = new Singleton();
    }
    // 3，提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}

