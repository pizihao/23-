package com.liu.singleresponsibility.single03;

/**
 * @author shidacaizi
 * @date 2020/5/12 20:00
 */
/*
* 方式三分析
* 1，这种修改方法虽然没有对原来的类做大的修改，只是增加方法
* 2，这里虽然没有在类这个级别上遵守单一职责原则，但是在方法这个级别上，让人符合单一职责原则
* */
public class SingleResponsibility_03 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.run("汽车");
        vehicle.runAir("飞机");
        vehicle.runWater("船");
    }
}
