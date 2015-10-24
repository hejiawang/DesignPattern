package com.wang.observerPattern.example;

/**
 * 被观察者接口
 * 
 * @author wang
 * 
 */
public interface Observable {

	/**
	 * 增加一个观察者
	 * 
	 * @param observer
	 *            观察者
	 */
	public void addObserver(Observer observer);

	/**
	 * 删除一个观察者
	 * 
	 * @param observer
	 *            观察者
	 */
	public void deleteObserver(Observer observer);

	/**
	 * 通知观察者
	 * 
	 * @param context
	 */
	public void notifyObserver(String context);
}
