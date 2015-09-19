package com.wang.commandPattern;

/**
 * 具体接收者</br>每个具体接收者都必须处理一定的业务逻辑
 * 
 * @author HeJW
 * 
 */
public class ConcreteReceiver2 extends Receiver {

	@Override
	public void doSomthing1() {
		System.out.println("ConcreteReceiver2------doSomthing1");
	}

	@Override
	public void doSomthing2() {
		System.out.println("ConcreteReceiver2------doSomthing2");
	}

}
