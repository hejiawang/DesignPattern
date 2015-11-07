package com.wang.designPattern.eventDispatch;

/**
 * 具体事件处理者——乞丐
 * 
 * @author wang
 * 
 */
public class Beggar extends EventCustomer {

	/**
	 * 乞丐只能处理被别人遗弃的东西
	 * 
	 * @param type
	 */
	public Beggar() {

		super(EventCustomType.DEL);
	}

	@Override
	public void exec(ProductEvent event) {

		Product p = event.getSource();// 事件的源头
		ProductEventType type = event.getEventType();
		System.out.println("乞丐处理事件:" + p.getName() + "销毁，事件类型:" + type);

	}

}
