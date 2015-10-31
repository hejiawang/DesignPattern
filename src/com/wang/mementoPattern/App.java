package com.wang.mementoPattern;

public class App {

	public static void main(String[] args) {
		// 定义一个发起人
		Originator originator = new Originator();
		// 定义一个备忘录管理员
		Caretaker caretaker = new Caretaker();
		// 为发起人创建一个备忘录
		caretaker.setMemento(originator.createMemento());
		// 为发起人恢复状态
		originator.restoreMemento(caretaker.getMemento());
	}
}
