package com.liu.memento.other;

/**
 * @author shidacaizi
 * @date 2020/5/31 20:51
 */
public class Memento {
    private String state; //状态信息

    public String getState() {
        return state;
    }

    public Memento(String state) {
        super();
        this.state = state;
    }
}
