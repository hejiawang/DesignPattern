package com.wang.mementoPattern;

/**
 * 备忘发起人角色
 * 
 * @author wang
 * 
 */
public class Originator {

	/**
	 * 内部状态
	 */
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 创建一个备忘录
	 * 
	 * @return 备忘录角色
	 */
	public Memento createMemento() {
		return new Memento(this.state);
	}

	/**
	 * 恢复一个备忘录
	 * 
	 * @param memento
	 *            备忘录角色
	 */
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}
