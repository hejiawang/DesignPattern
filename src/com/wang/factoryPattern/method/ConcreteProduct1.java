package com.wang.factoryPattern.method;

/**
 * 具体产品类1
 * @author HeJW
 *
 */
public class ConcreteProduct1 implements Product {

	public ConcreteProduct1(){
		System.out.println("ConcreteProduct1 被创建");
	}
	
	@Override
	public void method1() {
		System.out.println("xx");
	}

	@Override
	public String method2(String args) {
		return args;
	}

}
