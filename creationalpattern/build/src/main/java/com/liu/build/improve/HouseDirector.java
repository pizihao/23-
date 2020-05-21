package com.liu.build.improve;

/**
 * @author shidacaizi
 * @date 2020/5/21 9:58
 */
public class HouseDirector {
    HouseBuild houseBuilder = null;

    //构造器传入 houseBuilder

    public HouseDirector(HouseBuild houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入 houseBuilder

    public void setHouseBuilder(HouseBuild houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
