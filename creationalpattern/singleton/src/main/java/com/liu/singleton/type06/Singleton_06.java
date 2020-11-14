package com.liu.singleton.type06;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shidacaizi
 * @date 2020/5/14 8:45
 */
public class Singleton_06 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
//        测试
        Singleton singleton = Singleton.getInstance();

        /*此处跳过了双重检查，直接通过反射调用了私有的构造函数，破坏了单例*/
        Class<Singleton> singletonClass = Singleton.class;
        Constructor<?> con = singletonClass.getDeclaredConstructor();
        con.setAccessible(true);
        Singleton singleton1 = (Singleton) con.newInstance();
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
