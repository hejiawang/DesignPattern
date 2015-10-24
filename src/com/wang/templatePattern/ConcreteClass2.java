package com.wang.templatePattern;

/**
 * 具体模板类2
 * @author HeJW
 *
 */
public class ConcreteClass2 extends AbstractClass {

	@Override
	protected void method1() {
		System.out.println("2 1");
	}

	@Override
	protected void method2() {
		System.out.println("2 2");
	}

	@Override
	protected void method3() {
		System.out.println("2 3");
	}

}
