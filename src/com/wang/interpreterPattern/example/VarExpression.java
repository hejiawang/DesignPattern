package com.wang.interpreterPattern.example;

import java.util.HashMap;

/**
 * 变量解析器
 * 
 * @author wang
 * 
 */
public class VarExpression extends Expression {

	private String key;

	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
