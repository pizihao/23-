package com.liu.memento.game;

/**
 * @author shidacaizi
 * @date 2020/5/31 21:50
 */
public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("干架前");
        gameRole.display();

        //保存当前状态到caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("干架后");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();

        System.out.println("恢复到干架前");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }
}
