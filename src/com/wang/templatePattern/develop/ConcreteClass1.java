package com.wang.templatePattern.develop;

/**
 * 具体模板类1
 * @author HeJW
 *
 */
public class ConcreteClass1 extends AbstractClass {

	private boolean condition = true;
	
	//判断条件由客户端决定,默认执行
	public void setCondition( boolean condition ){
		this.condition = condition;
	}
	
	@Override
	protected boolean condition() {
		return this.condition;
	}

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
