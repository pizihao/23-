package com.liu.observer;

/**
 * @author shidacaizi
 * @date 2020/5/30 21:31
 */
public class CurrentConditions implements Observer {
    //温度，气压，湿度
    private float temperature;
    private float pressure ;
    private float humidity;

    //更新天气情况，是由WeatherData来调用，我使用推送模式
    @Override
    public void update(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display(){
        System.out.println("温度："+temperature);
        System.out.println("气压："+pressure);
        System.out.println("湿度："+humidity);
    }

}
