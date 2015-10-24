package com.wang.strategyPattern.example;

/**
 * 减法策略模式
 * 
 * @author HeJW
 * 
 */
public class Sub implements Calculator {

	@Override
	public int exec(int a, int b) {
		return a - b;
	}

}
