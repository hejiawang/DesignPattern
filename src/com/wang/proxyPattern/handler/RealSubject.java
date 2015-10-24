package com.wang.proxyPattern.handler;

/**
 * 真实主题类
 * @author HeJW
 *
 */
public class RealSubject implements Subject {

	@Override
	public void doSomething(String str) {
		System.out.println("do something ------" + str);
	}

}
