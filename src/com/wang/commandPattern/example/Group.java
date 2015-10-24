package com.wang.commandPattern.example;

/**
 * 抽象组（模拟项目开发，需求组、代码组、美工组、、、、、、）
 * @author HeJW
 *
 */
public abstract class Group {

	/**
	 * 找到这个组
	 */
	public abstract void find();
	
	/**
	 * 添加功能 
	 */
	public abstract void add();
	
	/**
	 * 删除功能
	 */
	public abstract void delete();
	
	/**
	 * 修改功能
	 */
	public abstract void change();
	
	/**
	 *变更计划
	 */
	public abstract void plan();
	
}
