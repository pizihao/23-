package com.liu.build.improve;

/**
 * @author shidacaizi
 * @date 2020/5/21 10:07
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        //指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        House house = houseDirector.constructHouse();
    }
}
