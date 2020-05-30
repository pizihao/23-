package com.liu.observer;

/**
 * @author shidacaizi
 * @date 2020/5/30 22:10
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);
        //通知各个注册的观察者
        weatherData.setData(10f,20f,20f);
    }
}
