package com.wang.decoratorPattern;

/**
 * 具体的装饰类
 * 
 * @author HeJW
 * 
 */
public class ConcreteDecorator1 extends Decorator {

	/**
	 * 定义被修饰者
	 * 
	 * @param component
	 */
	public ConcreteDecorator1(Component component) {
		super(component);
	}

	/**
	 * 定义自己的方法，进行修饰
	 */
	private void method1() {
		System.out.println("method1 修饰");
	}

	/**
	 * 在执行构件方法前，进行修饰
	 */
	@Override
	public void operate() {
		this.method1();
		super.operate();
	}
}
