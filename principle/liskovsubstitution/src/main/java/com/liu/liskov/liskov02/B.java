package com.liu.liskov.liskov02;

/**
 * @author shidacaizi
 * @date 2020/5/12 22:34
 */
public class B extends Base {
    private  A a = new A();
//如果B需要用A类的方法，使用组合关系
    public int func1(int a, int b){
        return a + b;
    }

    public int func2(int a, int b){
        return func1(a, b) + 9;
    }

    public int func3(int a,int b){
       return this.a.func1(a, b);
    }
}
