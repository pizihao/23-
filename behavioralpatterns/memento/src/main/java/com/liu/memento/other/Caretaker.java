package com.liu.memento.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shidacaizi
 * @date 2020/5/31 21:10
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
