package com.liu.birdge;

/**
 * @author shidacaizi
 * @date 2020/5/23 18:36
 */
//折叠式手机类，继承抽象类Phone
public class FoldedPhone extends Phone {

    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠样式的手机");
    }

    public void close(){
        super.close();
        System.out.println("折叠样式的手机");
    }

    public void call(){
        super.call();
        System.out.println("折叠样式的手机");
    }
}
