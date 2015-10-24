package com.wang.proxyPattern;

public class Proxy implements Subject {

	public Subject subject = null;
	
	//默认被代理者
	public Proxy(){
		this.subject = new Proxy();
	}
	
	//通过构造函数传递代理者
	public Proxy( Object...objects ){
		
	}
	
	@Override
	public void request() {

		// AOP
		this.before();
		this.subject.request();
		this.after();
	}
	
	private void before(){
		//在处理业务逻辑之前做一些事情
	}
	
	private void after(){
		//在处理业务逻辑之后做一些事情
	}

}
