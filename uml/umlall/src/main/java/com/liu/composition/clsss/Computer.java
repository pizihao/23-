package com.liu.composition.clsss;

/**
 * @author shidacaizi
 * @date 2020/5/13 20:58
 */
public class Computer {
    private Mouse mouse = new Mouse();
    private Moniter moniter = new Moniter();

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }
}
