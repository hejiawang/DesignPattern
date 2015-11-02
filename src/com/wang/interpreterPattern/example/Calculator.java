package com.wang.interpreterPattern.example;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解释器封装类
 * 
 * @author wang
 * 
 */
public class Calculator {

	// 定义一个表达式
	private Expression expression;

	/**
	 * 通过构造器传参，并解析
	 * 
	 * @param expSre
	 */
	public Calculator(String expStr) {
		// 定义一个栈
		Stack<Expression> stack = new Stack<Expression>();
		// 表达式拆分为字符数组
		char[] charArray = expStr.toCharArray();
		// 运算
		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':// 加法
				// 加法结果放到栈中
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left, right));
				break;
			case '-':// 减 法
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:// 公式中的变量
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
	}

	/**
	 * 开始运算
	 * 
	 * @param var
	 * @return
	 */
	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}
}
