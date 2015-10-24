package com.wang.proxyPattern.handler;

public class App2 {
	
	public static void main(String[] args) {
		
		Subject subject = new RealSubject();
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		proxy.doSomething(" hello ");
	}
}
