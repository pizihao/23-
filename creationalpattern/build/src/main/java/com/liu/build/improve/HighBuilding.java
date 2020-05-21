package com.liu.build.improve;

/**
 * @author shidacaizi
 * @date 2020/5/21 9:55
 */
public class HighBuilding extends HouseBuild{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基50米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼屋顶");
    }
}
