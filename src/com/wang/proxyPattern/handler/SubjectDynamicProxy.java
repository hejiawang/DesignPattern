package com.wang.proxyPattern.handler;

import java.lang.reflect.InvocationHandler;

/**
 * 具体业务的动态代理
 * @author HeJW
 *
 */
@SuppressWarnings("rawtypes")
public class SubjectDynamicProxy extends DynamicProxy {
	
	public static <T> T newProxyInstance( Subject subject ){
		
		//获得ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		
		//获得接口数组
		Class<?>[] classes = subject.getClass().getInterfaces();
		
		//获得handler 
		InvocationHandler handler = new MyInvocationHandler(subject);
		
		return newProxyInstance(loader, classes, handler);
	}
}
