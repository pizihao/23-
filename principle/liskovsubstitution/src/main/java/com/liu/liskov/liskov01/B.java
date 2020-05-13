package com.liu.liskov.liskov01;

/**
 * @author shidacaizi
 * @date 2020/5/12 22:34
 */
public class B extends A {

    public int func1(int a, int b){
        return a + b;
    }

    public int func2(int a, int b){
        return func1(a, b) + 9;
    }
}
