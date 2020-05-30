package com.liu.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author shidacaizi
 * @date 2020/5/30 15:03
 */
public class OutPutImpl {
    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList){
        this.collegeList = collegeList;
    }

    //遍历所有学院然后地调用printDepartment输出各个学院的系
    public void printCollege(){
        //从college取出所有学院
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            //取出一个学院
            College next = iterator.next();
            System.out.println("学院名称"+next.getName());
            //得到对应的迭代器
            printDepartment(next.createIterator());
        }
    }

    //输出 学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
           Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
