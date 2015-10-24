package com.wang.templatePattern;

/**
 * 具体模板类1
 * @author HeJW
 *
 */
public class ConcreteClass1 extends AbstractClass {

	@Override
	protected void method1() {
		System.out.println("1 1");
	}

	@Override
	protected void method2() {
		System.out.println("1 2");
	}

	@Override
	protected void method3() {
		System.out.println("1 3");
	}

}
