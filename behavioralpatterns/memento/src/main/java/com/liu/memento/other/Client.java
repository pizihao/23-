package com.liu.memento.other;

/**
 * @author shidacaizi
 * @date 2020/5/31 21:13
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setState("状态一 LV 1");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态二 LV 2");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态三 LV 1");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前状态"+originator.getState());
        //希望回到状态二
        originator.getStartFromMemento(caretaker.get(1));
        System.out.println("恢复到状态二："+originator.getState());

    }
}
