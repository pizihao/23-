package com.liu.visitor;

/**
 * @author shidacaizi
 * @date 2020/5/29 13:29
 */
/*
* 说明
* 1. 这里我们使用到了双分派，即首先在客户端程序中，将具体状态作为参數传递Woman中(第一 次分派)
* 2. 然后Woman 类调用作为参数的"具体方法"中方法getWomanResult, 同时将自己(this)作为参数传入，完成第二次的分派
*/
public class Woman extends Person{
    @Override
    public void accpet(Action action) {
        action.getWomanResult(this);
    }
}
