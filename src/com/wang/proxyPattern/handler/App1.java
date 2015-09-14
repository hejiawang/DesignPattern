package com.wang.proxyPattern.handler;

import java.lang.reflect.InvocationHandler;

public class App1 {
	
	public static void main(String[] args) {
		
		//定义一个主题
		Subject subject = new  RealSubject();
		
		//定义一个Handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		
		//定义主题的代理
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), 
				subject.getClass().getInterfaces(), handler);
		proxy.doSomething(" hello handler ");
		
	}
}
