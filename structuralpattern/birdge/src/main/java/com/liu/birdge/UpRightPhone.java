package com.liu.birdge;

/**
 * @author shidacaizi
 * @date 2020/5/23 18:39
 */
public class UpRightPhone extends Phone {
    //构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立样式的手机");
    }

    public void close(){
        super.close();
        System.out.println("直立样式的手机");
    }

    public void call(){
        super.call();
        System.out.println("直立样式的手机");
    }
}
