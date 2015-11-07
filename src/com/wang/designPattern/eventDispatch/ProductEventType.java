package com.wang.designPattern.eventDispatch;

/**
 * 事件类型定义
 * 
 * @author wang
 * 
 */
public enum ProductEventType {

	NEW_PRODUCT(1), // 新建产品
	DEL_PRODUCT(2), // 删除产品
	EDIT_PRODUCT(3), // 修改产品
	CLONE_PRODUCT(4); // 克隆产品

	private int value = 0;

	private ProductEventType(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
