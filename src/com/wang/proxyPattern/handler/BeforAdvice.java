package com.wang.proxyPattern.handler;

/**
 * 通知的实现类
 * @author HeJW
 *
 */
public class BeforAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("前置通知");
	}

}
