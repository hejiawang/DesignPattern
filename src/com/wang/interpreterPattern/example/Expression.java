package com.wang.interpreterPattern.example;

import java.util.HashMap;

/**
 * 抽象表达式
 * 
 * @author wang
 * 
 */
public abstract class Expression {

	/**
	 * 解析公式和值，其中var中的key值是公式中的参数，value值是具体的数字
	 * 
	 * @return
	 */
	public abstract int interpreter(HashMap<String, Integer> var);
}
