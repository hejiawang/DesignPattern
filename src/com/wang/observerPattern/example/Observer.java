package com.wang.observerPattern.example;

/**
 * 观察者接口
 * 
 * @author wang
 * 
 */
public interface Observer {

	/**
	 * 发现被观察者状态发生变化，更新自己的状态
	 * 
	 * @param context
	 */
	public void update(String context);
}
