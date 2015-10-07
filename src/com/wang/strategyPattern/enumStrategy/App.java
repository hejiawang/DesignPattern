package com.wang.strategyPattern.enumStrategy;

public class App {

	public static void main(String[] args) {
		
		int add = Calculator.ADD.exec(3, 4);
		System.out.println(add);
		
		int sub = Calculator.SUB.exec(5, 4);
		System.out.println(sub);
	}
}
