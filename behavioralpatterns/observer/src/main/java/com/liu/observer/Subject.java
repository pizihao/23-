package com.liu.observer;

/**
 * @author shidacaizi
 * @date 2020/5/30 21:28
 */
//让WeaterData来实现
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
