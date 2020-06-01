package com.liu.memento.other;

/**
 * @author shidacaizi
 * @date 2020/5/31 19:40
 */
public class Originator {
    private String state; //状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写一个方法，可以保存一个状态对象 Memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }
    //通过备忘录对象 恢复状态
    public void getStartFromMemento(Memento memento){
        state = memento.getState();
    }
}
