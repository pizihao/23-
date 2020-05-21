package com.liu.adapter.interfaceadapter;

/**
 * @author shidacaizi
 * @date 2020/5/21 18:14
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们需要使用的接口方法
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        absAdapter.m1();
    }
}
