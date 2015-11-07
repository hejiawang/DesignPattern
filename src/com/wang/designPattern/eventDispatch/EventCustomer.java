package com.wang.designPattern.eventDispatch;

import java.util.Vector;

/**
 * 抽象的事件处理者
 * 
 * @author wang
 * 
 */
public abstract class EventCustomer {

	// 容纳每个消费者能够处理的级别
	private Vector<EventCustomType> customType = new Vector<EventCustomType>();

	/**
	 * 每个消费者都要声明自己处理那一类别的事件
	 * 
	 * @param type
	 */
	public EventCustomer(EventCustomType type) {
		this.addCustomType(type);
	}

	/**
	 * 每个消费者都可以消费多个事件
	 * 
	 * @param type
	 */
	public void addCustomType(EventCustomType type) {
		customType.add(type);
	}

	/**
	 * 得到自己的处理能力
	 * 
	 * @return
	 */
	public Vector<EventCustomType> getCustomType() {
		return customType;
	}

	public abstract void exec( ProductEvent event );
	
}
