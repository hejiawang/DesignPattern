package com.wang.interpreterPattern.example;

/**
 * 抽象运算符号解析器
 * 
 * @author wang
 * 
 */
public abstract class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	/**
	 * 多有的解析公式都应只关心自己左右两个表达式的结果
	 * 
	 * @param left
	 * @param right
	 */
	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	};
}
