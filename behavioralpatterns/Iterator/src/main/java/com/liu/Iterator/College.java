package com.liu.Iterator;

import java.util.Iterator;

/**
 * @author shidacaizi
 * @date 2020/5/30 14:44
 */
public interface College {
    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器，遍历
    public Iterator createIterator();
}
