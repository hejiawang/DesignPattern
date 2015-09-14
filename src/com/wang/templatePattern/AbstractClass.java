package com.wang.templatePattern;

/**
 * 抽象模板类
 * @author HeJW
 *
 */
public abstract class AbstractClass {
	
	//基本方法
	protected abstract void  method1();
	protected abstract void  method2();
	protected abstract void  method3();
	
	//模板方法
	final public void templateMethod(){
		//调用基本方法，完成业务逻辑
		this.method1();
		this.method2();
		this.method3();
	}
	
	
}
