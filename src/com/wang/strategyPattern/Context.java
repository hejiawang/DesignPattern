package com.wang.strategyPattern;

/**
 * 封装角色
 * 
 * @author HeJW
 * 
 */
public class Context {

	private Strategy strategy = null;

	/**
	 * 通过构造函数设置具体策略
	 * 
	 * @param strategy
	 *            具体策略
	 */
	public Context(Strategy strategy) {

		this.strategy = strategy;
	}

	/**
	 * 封装后的策略方法
	 */
	public void doAnything() {
		this.strategy.doSomething();
	}
}
