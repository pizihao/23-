package com.liu.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shidacaizi
 * @date 2020/5/29 14:23
 */
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new ArrayList<>();

    //增加到list
    public void attach(Person person){
        persons.add(person);
    }
    //移除
    public void detach(Person person){
        persons.add(person);
    }
    //显示测评情况
    public void display(Action action){
        persons.forEach(person -> {
            person.accpet(action);
        });
    }
}
