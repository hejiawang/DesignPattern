package com.wang.mediatorPattern;

/**
 * 具体同事类2
 * @author HeJW
 *
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	/*
	 * 自己能够做到的事情
	 */
	public void selfMethod2(){
		System.out.println("处理自己的业务逻辑");
	}
	
	/**
	 * 自己办不到的事，需要和其他同事类协作完成，委托给中介者
	 */
	public void depMethod2(){
		System.out.println("自己不能独立完成的业务逻辑");
		super.mediator.doSomthing2();
	}

}
