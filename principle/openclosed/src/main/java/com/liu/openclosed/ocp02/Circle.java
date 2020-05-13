package com.liu.openclosed.ocp02;

/**
 * @author shidacaizi
 * @date 2020/5/12 22:55
 */
public class Circle extends Shape {
    Circle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
