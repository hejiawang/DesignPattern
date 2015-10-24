package com.wang.mediatorPattern;

/**
 * 抽象同事类
 * @author HeJW
 *
 */
public abstract class Colleague {
	
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}
