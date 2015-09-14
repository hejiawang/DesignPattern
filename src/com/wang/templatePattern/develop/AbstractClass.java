package com.wang.templatePattern.develop;

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
		
		//根据条件判断这个方法执行不执行
		if ( this.condition() ) {
			this.method2();
		}
		
		this.method3();
	}
	
	//钩子函数
	protected boolean condition() {
		return true;
	}
	
}
