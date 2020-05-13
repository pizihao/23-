package com.liu.segregationprinciple.segregation2;

/**
 * @author shidacaizi
 * @date 2020/5/12 21:05
 */
public class SegregationPrinciple_02 {
    public static void main(String[] args) {
        A_02 a_02 = new A_02();
        a_02.depend1(new B_02());
        a_02.depend2(new B_02());
        a_02.depend3(new B_02());

        C_02 c_02 = new C_02();
        c_02.depend1(new D_02());
        c_02.depend4(new D_02());
        c_02.depend5(new D_02());
    }
}
