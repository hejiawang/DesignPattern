package com.wang.strategyPattern.example;

/**
 * 加法策略模式
 * 
 * @author HeJW
 * 
 */
public class Add implements Calculator {

	@Override
	public int exec(int a, int b) {
		return a + b;
	}

}
