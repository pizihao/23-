package com.liu.adapter.classadapter;

/**
 * @author shidacaizi
 * @date 2020/5/21 16:30
 */
public class Phone {
    //充电
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V() == 5){
            System.out.println("电压5v，可以充电");
        }else if(voltage5V.output5V() > 5){
            System.out.println("电压大于5V，不能充电");
        }
    }
}
