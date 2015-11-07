package com.wang.designPattern.eventDispatch;

/**
 * 具体事件处理者——平民
 * 
 * @author wang
 * 
 */
public class Commoner extends EventCustomer {

	/**
	 * 平民只能处理创建事件
	 * 
	 * @param type
	 */
	public Commoner() {

		super(EventCustomType.NEW);
	}

	@Override
	public void exec(ProductEvent event) {

		Product p = event.getSource();// 事件的源头
		ProductEventType type = event.getEventType();
		System.out.println("平民处理事件:" + p.getName() + "诞生记，事件类型:" + type);

	}

}
