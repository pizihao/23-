package com.liu.segregationprinciple.segregation2;


/**
 * @author shidacaizi
 * @date 2020/5/12 20:55
 */
//A类通过接口Interface2_1,Interface2_2 依赖(使用) B类，但是只会用到1,2,3
public class A_02 {
    public void depend1(Interface2_1 interface1){
        interface1.segregation1();
    }

    public void depend2(Interface2_2 interface1){
        interface1.segregation2();
    }

    public void depend3(Interface2_2 interface1){
        interface1.segregation3();
    }
}
