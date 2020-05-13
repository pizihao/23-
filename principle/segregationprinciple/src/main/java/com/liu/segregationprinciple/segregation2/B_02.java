package com.liu.segregationprinciple.segregation2;

import com.liu.segregationprinciple.segregation1.Interface1;

/**
 * @author shidacaizi
 * @date 2020/5/12 20:56
 */
public class B_02 implements Interface2_1,Interface2_2 {
    @Override
    public void segregation1() {
        System.out.println("B----segregation1");
    }

    @Override
    public void segregation2() {
        System.out.println("B----segregation2");
    }

    @Override
    public void segregation3() {
        System.out.println("B----segregation3");
    }
}
