package com.wang.adapterPattern;

/**
 * ÊÊÅäÆ÷½ÇÉ«
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
