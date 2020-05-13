package com.liu.openclosed.ocp02;

/**
 * @author shidacaizi
 * @date 2020/5/12 22:54
 */
public class Rectangle extends Shape {
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
