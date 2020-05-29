package com.liu.visitor;

/**
 * @author shidacaizi
 * @date 2020/5/29 13:19
 */
public class Man extends Person{
    @Override
    public void accpet(Action action) {
        action.getManResult(this);
    }
}
