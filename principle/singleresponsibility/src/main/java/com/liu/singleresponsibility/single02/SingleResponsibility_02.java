package com.liu.singleresponsibility.single02;

/**
 * @author shidacaizi
 * @date 2020/5/12 19:05
 */
/*
* 方案二的分析
* 1，遵守单一职责原则
* 2，但是这样做的改动很大，即将类分解，同时修改客户端
* 3，改进：直接修改Vehicle 类，改动的代码会比较少
* */
public class SingleResponsibility_02 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();

        waterVehicle.run("船");
    }
}
