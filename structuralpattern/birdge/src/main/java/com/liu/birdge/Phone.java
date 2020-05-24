package com.liu.birdge;

/**
 * @author shidacaizi
 * @date 2020/5/23 18:34
 */
public abstract class Phone {
    //组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
