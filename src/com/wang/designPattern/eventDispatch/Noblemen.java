package com.wang.designPattern.eventDispatch;

/**
 * 具体事件处理者——贵族
 * 
 * @author wang
 * 
 */
public class Noblemen extends EventCustomer {

	/**
	 * 贵族能处理修改和克隆
	 * 
	 * @param type
	 */
	public Noblemen() {

		super(EventCustomType.EDIT);
		super.addCustomType(EventCustomType.CLONE);
	}

	@Override
	public void exec(ProductEvent event) {

		Product p = event.getSource();// 事件的源头
		ProductEventType type = event.getEventType();
		if (type.getValue() == EventCustomType.CLONE.getValue()) {
			System.out.println("贵族处理事件:" + p.getName() + "克隆，事件类型:" + type);
		} else {
			System.out.println("贵族处理事件:" + p.getName() + "修改，事件类型:" + type);
		}
	}

}
