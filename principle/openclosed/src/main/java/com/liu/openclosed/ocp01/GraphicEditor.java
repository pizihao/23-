package com.liu.openclosed.ocp01;

/**
 * @author shidacaizi
 * @date 2020/5/12 22:57
 */
public class GraphicEditor {
    public  void drawShape(Shape shape){
        if (shape.m_type == 1){
            drawRectangle(shape);
        }else if (shape.m_type == 2){
            drawCircle(shape);
        }
    }
    public void drawRectangle(Shape shape){
        System.out.println("矩形");
    }
    public void drawCircle(Shape shape){
        System.out.println("圆形");
    }
}
