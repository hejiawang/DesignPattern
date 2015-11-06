package com.wang.bridgePattern;

public class App {

	public static void main(String[] args) {

		/*
		 * 定义一个实现化角色
		 */
		Implementor imp = new ConcreteImplementor1();

		/*
		 * 定义一个抽象化角色
		 */
		Abstraction abs = new RefinedAbstraction(imp);

		abs.request();
		
	}
}
