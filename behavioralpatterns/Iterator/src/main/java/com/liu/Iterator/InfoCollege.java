package com.liu.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shidacaizi
 * @date 2020/5/30 14:58
 */
public class InfoCollege implements College {

    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("网络信息安全", "网络信息安全");
        addDepartment("电子技术", "电子技术");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {

        Department department = new Department(name, desc);
        departmentList.add(department);

    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageiterator(departmentList);
    }
}
