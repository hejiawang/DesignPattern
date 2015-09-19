package com.wang.commandPattern;

/**
 * 接收者角色 </br> 该角色就是干活的角色
 * 
 * @author HeJW
 * 
 */
public abstract class Receiver {

	/**
	 * 抽象接收者，定义每个接收者都必须完成的业务.
	 */
	public abstract void doSomthing1();

	public abstract void doSomthing2();
}
