package com.wang.facadePattern.context;

/**
 * 处理子系统之间的业务逻辑，保证门面不参与子系统之间的业务逻辑
 * 
 * @author wang
 * 
 */
public class Context {

	/*
	 * 委托对象
	 */
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();

	/*
	 * 组合的业务逻辑
	 */
	public void complexMethod() {
		System.out.println("class A and B begin");
		this.a.doSomething();
		this.b.doSomething();
		System.out.println("class A and B end ");
	}

}
