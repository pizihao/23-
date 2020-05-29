package com.liu.template;

/**
 * @author shidacaizi
 * @date 2020/5/28 13:03
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondimerts() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
