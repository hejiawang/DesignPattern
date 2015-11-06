package com.wang.bridgePattern;

/**
 * 具体实现化角色1
 * 
 * @author wang
 * 
 */
public class ConcreteImplementor1 implements Implementor {

	@Override
	public void doSomething() {
		System.out.println("ConcreteImplementor1...doSomething...");
	}

	@Override
	public void doAnything() {
		System.out.println("ConcreteImplementor1...doAnything...");
	}
}
