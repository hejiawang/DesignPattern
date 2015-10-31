package com.wang.mementoPattern.clone.simple;

/**
 * 发起人自主备份和恢复
 * 
 * @author wang
 * 
 */
public class Originator implements Cloneable {

	/**
	 * 内部状态
	 */
	private String state = "";

	/**
	 * 为备份和恢复准备的对象
	 */
	private Originator backup;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 创建一个备忘录
	 */
	public void createMemento() {
		this.backup = this.clone();
	}

	/**
	 * 恢复一个备忘录
	 */
	public void restoreMemento() {
		// 进行恢复前应进行判断，防止空指针
		this.setState(this.backup.getState());
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
