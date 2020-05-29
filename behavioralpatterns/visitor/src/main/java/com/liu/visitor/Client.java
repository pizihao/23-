package com.liu.visitor;

/**
 * @author shidacaizi
 * @date 2020/5/29 14:25
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        //成功
        Success success = new Success();
        structure.display(success);

        Fail fail = new Fail();
        structure.display(fail);
    }
}
