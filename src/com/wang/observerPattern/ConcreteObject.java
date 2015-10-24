package com.wang.observerPattern;

/**
 * 具体观察者
 * 
 * @author wang
 * 
 */
public class ConcreteObject implements Observer {

	@Override
	public void update() {
		System.out.println("ConcreteObject update ... ");
	}

}
