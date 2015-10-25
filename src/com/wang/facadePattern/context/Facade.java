package com.wang.facadePattern.context;

/**
 * 门面模式</br> 注：门面不参与子系统的业务逻辑
 * 
 * @author wang
 * 
 */
public class Facade {

	/*
	 * 被委托的对象
	 */
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private ClassC c = new ClassC();
	private Context context = new Context();

	/*
	 * 提供给外部访问的方法
	 */
	public void methodA() {
		this.a.doSomething();
	}

	public void methodB() {
		this.b.doSomething();
	}

	public void methodC() {
		this.c.doSomething();
	}
	
	public void methodComplex(){
		this.context.complexMethod();
	} 
}
