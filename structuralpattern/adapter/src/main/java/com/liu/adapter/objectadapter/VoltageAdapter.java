package com.liu.adapter.objectadapter;

/**
 * @author shidacaizi
 * @date 2020/5/21 16:27
 */
public class VoltageAdapter implements Voltage5V {

    private Voltage220V output220V;

    //通过构造器传入一个Voltage220V的实例
    public VoltageAdapter(Voltage220V output220V) {
        this.output220V = output220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != output220V){
            //获取220v的电压
            int src = output220V.output220V();
            System.out.println("使用对象适配器进行适配");
            dst = src / 44;
            System.out.println("适配完成，输出的电压是" + dst);
        }
        return dst;
    }
}
