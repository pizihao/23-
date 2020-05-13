package com.liu.demeter.demeter02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shidacaizi
 * @date 2020/5/13 8:29
 */
/*
* 分析SchoolManager类的直接朋友有哪些，Employee CollegeManager
* CollegeEmployee不是直接朋友，而是一个陌生类。这样就违反了迪米特法则
* */
public class SchoolManager {
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学院总部员工ID=" + i);
            list.add(employee);
        }
        return list;
    }
    void printAllEmployee(CollegeManager sub) {
        sub.printEmployee();
//        获取学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("---------学校总部员工-------");
        list2.forEach(employee -> {
            System.out.println(employee.getId());
        });
    }
}
