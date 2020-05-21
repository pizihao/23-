package com.liu.build.improve;

/**
 * @author shidacaizi
 * @date 2020/5/21 9:53
 */
public class CommonHouse extends HouseBuild {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
