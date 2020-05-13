package com.liu.segregationprinciple.segregation2;

import com.liu.segregationprinciple.segregation1.Interface1;

/**
 * @author shidacaizi
 * @date 2020/5/12 20:56
 */
//C类通过接口Interface2_1,Interface2_3 依赖(使用) D类，但是只会用到1,4,5
public class C_02 {
    public void depend1(Interface2_1 interface1) {
        interface1.segregation1();
    }

    public void depend4(Interface2_3 interface1) {
        interface1.segregation4();
    }

    public void depend5(Interface2_3 interface1) {
        interface1.segregation5();
    }
}