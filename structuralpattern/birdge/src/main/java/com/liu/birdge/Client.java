package com.liu.birdge;

/**
 * @author shidacaizi
 * @date 2020/5/23 18:40
 */
public class Client {

    public static void main(String[] args) {
        //获取折叠式手机 （样式+品牌）
        Phone phone = new FoldedPhone(new XiaoMi());

        phone.open();
        phone.close();
        phone.call();
    }
}
