package com.wang.adapterPattern;

/**
 * 目标角色实现类
 * 
 * @author wang
 * 
 */
public class ConcreteTarget implements Target {

	@Override
	public void request() {

		System.out.println("ConcreteTarget");
	}

}
