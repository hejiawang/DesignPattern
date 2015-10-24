package com.wang.observerPattern;

/**
 * 具体被监视者
 * 
 * @author wang
 * 
 */
public class ConcreteSubject extends Subject {

	/**
	 * 被监视者的具体业务
	 */
	public void doSomething() {
		System.out.println(" subject doSomething ... ");
		// 通知观察者
		super.notifyObserver();
	}
}
