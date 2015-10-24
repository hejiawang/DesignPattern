package com.wang.adapterPattern;

/**
 * 适配器角色
 * 
 * @author wang
 * 
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.doSomething();
	}
}
