package com.wang.mementoPattern.clone.simple;

/**
 * 适合比较简单的场景
 * 
 * @author wang
 * 
 */
public class App {

	public static void main(String[] args) {
		// 定义一个发起人
		Originator originator = new Originator();
		originator.setState("初始状态...");
		System.out.println("初始状态:" + originator.getState());
		// 建立备份
		originator.createMemento();
		// 修改状态
		originator.setState("修改后的状态...");
		System.out.println("修改后的状态:" + originator.getState());
		// 恢复原有状态
		originator.restoreMemento();
		System.out.println("恢复后的状态:" + originator.getState());
	}
}
