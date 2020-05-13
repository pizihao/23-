package com.liu.demeter.demeter01;

/**
 * @author shidacaizi
 * @date 2020/5/13 8:17
 */
/*
* 客户端
* */
public class Demeter_01 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
