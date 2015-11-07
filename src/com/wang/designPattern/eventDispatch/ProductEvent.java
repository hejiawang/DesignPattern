package com.wang.designPattern.eventDispatch;

import java.util.Observable;

/**
 * 产品事件
 * 
 * @author wang
 * 
 */
public class ProductEvent extends Observable {

	private Product source; // 事件起源
	private ProductEventType type; // 事件类型

	public ProductEvent(Product source) {

		this(source, ProductEventType.NEW_PRODUCT);
	}

	public ProductEvent(Product source, ProductEventType type) {

		this.source = source;
		this.type = type;
		this.notifyEventDispath(); // 事件触发
	}

	/**
	 * 获得事件的始作俑者
	 * 
	 * @return
	 */
	public Product getSource() {

		return this.source;
	}

	/**
	 * 获得事件的类型
	 * 
	 * @return
	 */
	public ProductEventType getEventType() {

		return this.type;
	}

	/**
	 * 通知事件处理中心
	 */
	private void notifyEventDispath() {

		super.addObserver(EventDispatch.getEventDispatch());
		super.setChanged();
		super.notifyObservers(source);
	}

}
