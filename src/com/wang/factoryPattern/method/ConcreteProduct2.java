package com.wang.factoryPattern.method;

/**
 * 具体产品类2
 * @author HeJW
 *
 */
public class ConcreteProduct2 implements Product {

	public ConcreteProduct2(){
		System.out.println("ConcreteProduct2 被创建");
	}
	
	@Override
	public void method1() {
		System.out.println("yy");
	}

	@Override
	public String method2(String args) {
		return args;
	}

}
