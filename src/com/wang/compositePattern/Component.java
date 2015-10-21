package com.wang.compositePattern;

/**
 * 组合模式的抽象构建，最顶层的抽象模块
 * 
 * @author wang
 * 
 */
public abstract class Component {

	/**
	 * 个体和整体都具有的方法
	 */
	public void doSomething() {
		System.out.println(" Component doSomething ...");
	}
}
