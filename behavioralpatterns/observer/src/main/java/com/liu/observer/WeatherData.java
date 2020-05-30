package com.liu.observer;

import java.util.ArrayList;

/**
 * @author shidacaizi
 * @date 2020/5/30 22:00
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure ;
    private float humidity;
    //观察者集合
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void dataChange(){
        notifyObserver();
    }

    public void setData(Float temperature, Float pressure, Float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        //遍历所有的观察者并通知
        observers.forEach(observer -> {
            observer.update(this.temperature,this.pressure,this.humidity);
        });
    }
}
