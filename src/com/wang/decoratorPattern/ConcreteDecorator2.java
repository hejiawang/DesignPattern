package com.wang.decoratorPattern;

/**
 * 具体的装饰类
 * 
 * @author HeJW
 * 
 */
public class ConcreteDecorator2 extends Decorator {

	/**
	 * 定义被修饰者
	 * 
	 * @param component
	 */
	public ConcreteDecorator2(Component component) {
		super(component);
	}

	/**
	 * 定义自己的方法，进行修饰
	 */
	private void method2() {
		System.out.println("method2 修饰");
	}

	/**
	 * 在执行构件方法后，进行修饰
	 */
	@Override
	public void operate() {
		super.operate();
		this.method2();
	}
}
