package com.liu.build.improve;

/**
 * @author shidacaizi
 * @date 2020/5/21 9:44
 */
//抽象的建造者
public abstract class HouseBuild {
    protected House house = new House();

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子
    public House buildHouse(){
        return house;
    }

}
