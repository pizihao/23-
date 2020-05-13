package com.liu.demeter.demeter02;

/**
 * @author shidacaizi
 * @date 2020/5/13 8:17
 */
/*
* 客户端
* */
public class Demeter_02 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
