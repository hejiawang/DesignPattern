package com.wang.mementoPattern.clone;

/**
 * 融合备忘录的备忘发起人角色
 * 
 * @author wang
 * 
 */
public class Originator implements Cloneable {

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
	 * @return 自己
	 */
	public Originator createMemento() {
		return (Originator) this.clone();
	}

	/**
	 * 恢复一个备忘录
	 * 
	 * @param originator
	 *            备忘录角色
	 */
	public void restoreMemento(Originator originator) {
		this.setState(originator.getState());
	}

	/**
	 * 克隆当前对象
	 */
	@Override
	protected Originator clone() {
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
