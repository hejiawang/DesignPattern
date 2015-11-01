package com.wang.statePattern;

public class App {

	public static void main(String[] args) {
		// 定义环境角色
		Context context = new Context();
		// 初始化状态
		context.setCurrentState(new ConcreteState1());
		context.handle1();
		context.handle2();
	}
}
