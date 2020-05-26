package com.liu.facade;

/**
 * @author shidacaizi
 * @date 2020/5/26 9:30
 */
public class Client {
    public static void main(String[] args) {
        //统一调用
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }
}
