package com.wang.bridgePattern;

/**
 * 抽象化角色
 * 
 * @author wang
 * 
 */
public abstract class Abstraction {

	/*
	 * 定义对实现化角色的应用
	 */
	private Implementor imp;

	/**
	 * 约束子类必须实现该构造函数
	 */
	public Abstraction(Implementor imp) {
		this.imp = imp;
	}

	/**
	 * 自身的行为和属性
	 */
	public void request() {
		this.imp.doSomething();
	}

	/**
	 * 获得实现化角色
	 * 
	 * @return
	 */
	public Implementor getImp() {
		return imp;
	}

}
