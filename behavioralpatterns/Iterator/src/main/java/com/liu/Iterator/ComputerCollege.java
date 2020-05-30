package com.liu.Iterator;

import java.util.Iterator;

/**
 * @author shidacaizi
 * @date 2020/5/30 14:50
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java工程师", "Java工程师");
        addDepartment("大数据工程师", "大数据工程师");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
