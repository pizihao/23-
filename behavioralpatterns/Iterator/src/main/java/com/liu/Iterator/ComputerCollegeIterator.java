package com.liu.Iterator;

import java.util.Iterator;

/**
 * @author shidacaizi
 * @date 2020/5/30 14:14
 */
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要知道Department是以怎样的方式存放的
    Department [] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {

        if (position >=departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {
        //空实现
    }
}
