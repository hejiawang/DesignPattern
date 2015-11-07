package com.wang.designPattern.eventDispatch;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * 事件的观察者</br>也是事件的分发者</br>单例模式
 * 
 * @author wang
 * 
 */
public class EventDispatch implements Observer {

	private final static EventDispatch dispatch = new EventDispatch();
	private Vector<EventCustomer> customer = new Vector<EventCustomer>(); // 事件消费者

	private EventDispatch() {
	}

	/**
	 * 获得单例的对象
	 * 
	 * @return 单例的对象
	 */
	public static EventDispatch getEventDispatch() {

		return dispatch;
	}

	/**
	 * 注册事件处理者
	 * 
	 * @param customer
	 *            事件处理者
	 */
	public void registerCustomer(EventCustomer customer) {

		this.customer.add(customer);
	}

	@Override
	public void update(Observable o, Object arg) {

		Product product = (Product) arg;// 事件源头
		ProductEvent event = (ProductEvent) o;// 事件
		// 处理者处理，这里是中介者模式的核心，
		for (EventCustomer e : customer) {
			// 处理能力是否匹配
			for (EventCustomType t : e.getCustomType()) {
				if (t.getValue() == event.getEventType().getValue()) {
					e.exec(event);
				}
			}
		}
	}
}
