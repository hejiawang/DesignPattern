package com.wang.mementoPattern.manyState;

/**
 * 多状态的备忘录模式测试类
 * 
 * @author wang
 * 
 */
public class App {
	public static void main(String[] args) {
		//定义一个发起人
		Originator ori = new Originator();
		//定义一个备忘录管理员
		Caretaker caretaker = new Caretaker();
		//初始化状态
		ori.setState1("xx1");
		ori.setState2("xx2");
		ori.setState3("xx3");
		System.out.println("初始化状态 :\n" + ori);
		//创建一个备忘录
		caretaker.setMemento(ori.createMemento());
		//修改状态
		ori.setState1("yy1");
		ori.setState2("yy2");
		ori.setState3("yy3");
		System.out.println("修改后状态 :\n" + ori);
		//恢复一个备忘录 
		ori.restoreMemento(caretaker.getMemento());
		System.out.println("恢复后状态 :\n" + ori);
	}
}
