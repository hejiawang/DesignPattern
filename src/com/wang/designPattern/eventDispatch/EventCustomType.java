package com.wang.designPattern.eventDispatch;

/**
 * 事件处理枚举
 * 
 * @author wang
 * 
 */
public enum EventCustomType {

	NEW(1), // 新建立事件
	DEL(2), // 删除事件
	EDIT(3), // 修改事件
	CLONE(4); // 克隆事件

	private int value = 0;

	private EventCustomType(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
