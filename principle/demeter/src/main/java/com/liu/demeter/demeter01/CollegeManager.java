package com.liu.demeter.demeter01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shidacaizi
 * @date 2020/5/13 8:18
 */
/*
* 管理类
* */
public class CollegeManager {
//    返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> employeeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工ID=" + i);
            employeeList.add(emp);
        }
        return employeeList;
    }
}
