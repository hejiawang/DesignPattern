package com.wang.proxyPattern.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * @author HeJW
 *
 * @param <T>
 */
public class DynamicProxy<T> {
	
	public static <T> T newProxyInstance( ClassLoader loader, Class<?>[] interfaces,
			InvocationHandler h){
		
		if(true){
			//执行一个前置通知
			(new BeforAdvice()).exec();
		}
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
		
	}
}
