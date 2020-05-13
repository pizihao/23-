package com.liu.singleresponsibility.single01;

/**
 * @author shidacaizi
 * @date 2020/5/12 18:58
 */
public class SingleResponsibility_01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}
