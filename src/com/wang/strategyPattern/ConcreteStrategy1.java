package com.wang.strategyPattern;

/**
 * 具体策略角色
 * 
 * @author HeJW
 * 
 */
public class ConcreteStrategy1 implements Strategy {

	@Override
	public void doSomething() {

		System.out.println("具体策略角色1的策略");
	}
}
