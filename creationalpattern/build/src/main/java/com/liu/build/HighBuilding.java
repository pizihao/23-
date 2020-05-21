package com.liu.build;

/**
 * @author shidacaizi
 * @date 2020/5/21 8:46
 */
public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBaisc() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
