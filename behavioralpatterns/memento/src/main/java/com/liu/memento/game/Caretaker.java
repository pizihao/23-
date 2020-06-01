package com.liu.memento.game;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author shidacaizi
 * @date 2020/5/31 21:32
 */
//守护者对象，保存游戏角色状态
public class Caretaker {
    //如果只保存一次状态
    private Memento memento;
    //对GameRole 保存对此状态
    private ArrayList<Memento> mementos;
    //对多个游戏角色保存多个状态
    private HashMap<String, ArrayList<Memento>> listHashMap;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public ArrayList<Memento> getMementos() {
        return mementos;
    }

    public void setMementos(ArrayList<Memento> mementos) {
        this.mementos = mementos;
    }

    public HashMap<String, ArrayList<Memento>> getListHashMap() {
        return listHashMap;
    }

    public void setListHashMap(HashMap<String, ArrayList<Memento>> listHashMap) {
        this.listHashMap = listHashMap;
    }
}
