package com.wang.factoryPattern.abstractF;

/**
 * 产品接口定义
 * @author HeJW
 *
 */
public interface IProduct {
	
	//每个产品共有的方法
	public void shareMethod();
	
	//每个产品相同的方法，不同的实现
	public abstract void doSomething();
}
