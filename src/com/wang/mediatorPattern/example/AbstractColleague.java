package com.wang.mediatorPattern.example;

/**
 * 抽象同事类
 * 
 * @author HeJW
 * 
 */
public abstract class AbstractColleague {

	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
}
