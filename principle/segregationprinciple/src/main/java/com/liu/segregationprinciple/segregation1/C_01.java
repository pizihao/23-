package com.liu.segregationprinciple.segregation1;

/**
 * @author shidacaizi
 * @date 2020/5/12 20:56
 */
//C类通过接口Interface1 依赖(使用) D类，但是只会用到1,4,5
public class C_01 {
    public void depend1(Interface1 interface1) {
        interface1.segregation1();
    }

    public void depend2(Interface1 interface1) {
        interface1.segregation4();
    }

    public void depend3(Interface1 interface1) {
        interface1.segregation5();
    }
}