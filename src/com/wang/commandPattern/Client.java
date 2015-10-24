package com.wang.commandPattern;

public class Client {

	public static void main(String[] args) {
		
		//首先定义一个执行命令的人
		Invoker invoker = new Invoker();
		
		//定义接收者，也就是干什么活
		Receiver receiver = new ConcreteReceiver1();
		
		//定义命令
		Command command = new ConcreteCommand1(receiver);
		
		//把命令交给命令执行者，并执行
		invoker.setCommand(command);
		invoker.action();
	}

}
