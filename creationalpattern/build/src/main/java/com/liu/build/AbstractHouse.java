package com.liu.build;

/**
 * @author shidacaizi
 * @date 2020/5/21 8:43
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBaisc();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    //把上边三个放在一起
    public void build() {
        buildBaisc();
        buildWalls();
        roofed();
    }
}
