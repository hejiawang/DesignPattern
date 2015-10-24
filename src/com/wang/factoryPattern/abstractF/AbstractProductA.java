package com.wang.factoryPattern.abstractF;

/**
 * A系类产品
 * @author HeJW
 *
 */
public abstract class AbstractProductA implements IProduct {
	
	public void shareMethod(){
		System.out.println("每个产品共有的方法B");
	}
	
	public abstract void doSomething();
	
}
