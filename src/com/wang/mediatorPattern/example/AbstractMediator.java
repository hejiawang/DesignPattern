package com.wang.mediatorPattern.example;

/**
 * 抽象中介者
 * 
 * @author HeJW
 * 
 */
public abstract class AbstractMediator {

	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	public AbstractMediator() {
		this.purchase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}

	/**
	 * 中介者模式中的事件方法</br> 处理多个对象之间的关系
	 * 
	 * @param str
	 * @param object
	 */
	public abstract void execute(String str, Object... object);
}
