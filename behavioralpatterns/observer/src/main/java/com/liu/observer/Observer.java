package com.liu.observer;

/**
 * @author shidacaizi
 * @date 2020/5/30 21:30
 */
public interface Observer {
    public void update(Float temperature,Float pressure, Float humidity);
}
