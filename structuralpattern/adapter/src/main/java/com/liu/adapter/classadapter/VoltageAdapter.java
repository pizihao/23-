package com.liu.adapter.classadapter;

/**
 * @author shidacaizi
 * @date 2020/5/21 16:27
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        //获取220V的电压
        int src = output220V();
        return src / 44;
    }
}
