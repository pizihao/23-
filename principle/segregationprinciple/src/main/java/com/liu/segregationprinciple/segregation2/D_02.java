package com.liu.segregationprinciple.segregation2;

import com.liu.segregationprinciple.segregation1.Interface1;

/**
 * @author shidacaizi
 * @date 2020/5/12 20:56
 */
public class D_02 implements Interface2_1,Interface2_3 {
    @Override
    public void segregation1() {
        System.out.println("D----segregation1");
    }

    @Override
    public void segregation4() {
        System.out.println("D----segregation4");
    }

    @Override
    public void segregation5() {
        System.out.println("D----segregation5");
    }
}