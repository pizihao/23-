package com.liu.interpreter;

import java.util.HashMap;

/**
 * @author shidacaizi
 * @date 2020/6/1 11:09
 */
//变量的解析器
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    //interpreter根据变量的名称返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
