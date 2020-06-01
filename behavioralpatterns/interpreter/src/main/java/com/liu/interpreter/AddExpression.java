package com.liu.interpreter;

import java.util.HashMap;

/**
 * @author shidacaizi
 * @date 2020/6/1 11:08
 */
//加法解析器
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    public int interpreter (HashMap<String,Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
