package com.liu.liskov.liskov02;

/**
 * @author shidacaizi
 * @date 2020/5/12 22:24
 */
public class Liskov_02 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11, 3));
        System.out.println("1-8="+a.func1(1, 8));

        B b = new B();
//因为B类不再继承A类所以调用者不会认为func1是求减法了
        System.out.println("11+3="+b.func1(11, 3));
        System.out.println("1+8="+b.func1(1, 8));
        System.out.println("11+3+9="+b.func2(11, 3));

//使用组合仍然可以使用到A类相关方法
        System.out.println("11-3="+b.func3(11, 3));
    }
}
