package com.liu.interpreter;

import java.util.HashMap;

/**
 * @author shidacaizi
 * @date 2020/6/1 11:09
 */
//每个运算符号解析器，每个运算符号，都只和自己左右两个数字有关系
//但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
public class SymbolExpression extends Expression{
    protected Expression right;
    protected Expression left;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为SymbolExpression是让其子类来实现，因此inferpreter是默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
