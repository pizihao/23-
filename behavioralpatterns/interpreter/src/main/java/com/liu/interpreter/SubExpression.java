package com.liu.interpreter;

import java.util.HashMap;

/**
 * @author shidacaizi
 * @date 2020/6/1 11:09
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter (HashMap<String,Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
