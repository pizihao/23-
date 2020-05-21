package com.liu.adapter.classadapter;

/**
 * @author shidacaizi
 * @date 2020/5/21 16:20
 */
public class Voltage220V {
    //输出220伏的电压
    public int output220V(){
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
