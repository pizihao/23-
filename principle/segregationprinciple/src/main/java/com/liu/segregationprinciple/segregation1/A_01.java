package com.liu.segregationprinciple.segregation1;

/**
 * @author shidacaizi
 * @date 2020/5/12 20:55
 */
//A类通过接口Interface1 依赖(使用) B类，但是只会用到1,2,3
public class A_01 {
    public void depend1(Interface1 interface1){
        interface1.segregation1();
    }

    public void depend2(Interface1 interface1){
        interface1.segregation2();
    }

    public void depend3(Interface1 interface1){
        interface1.segregation3();
    }
}
