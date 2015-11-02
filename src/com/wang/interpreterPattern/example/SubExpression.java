package com.wang.interpreterPattern.example;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	/**
	 * 把左右两个表达式运算的结果互减
	 */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}

}
