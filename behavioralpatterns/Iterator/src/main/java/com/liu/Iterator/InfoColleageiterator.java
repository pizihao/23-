package com.liu.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author shidacaizi
 * @date 2020/5/30 14:38
 */
public class InfoColleageiterator implements Iterator {

    List<Department> departmentList; //信息工程学院是以List方式存放系
    int index = 1;//索引

    public InfoColleageiterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
