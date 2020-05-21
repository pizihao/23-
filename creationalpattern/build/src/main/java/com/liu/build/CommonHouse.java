package com.liu.build;

/**
 * @author shidacaizi
 * @date 2020/5/21 8:45
 */
//模拟盖一个普通的房子
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBaisc() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
