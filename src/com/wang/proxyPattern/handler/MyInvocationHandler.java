package com.wang.proxyPattern.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的Handler
 * @author HeJW
 *
 */
public class MyInvocationHandler implements InvocationHandler {

	//被代理的对象
	private Object target = null;
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(this.target, args);
	}

}
