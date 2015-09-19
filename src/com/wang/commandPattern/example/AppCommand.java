package com.wang.commandPattern.example;

/**
 * 使用命令模式的客户端
 * 
 * @author HeJW
 * 
 */
public class AppCommand {

	// public static void main(String[] args) {
	//
	// Invoker invoker = new Invoker();
	// Command command = new AddRequirementCommand();// 还可以定义出肯多命令
	// invoker.setCommand(command);
	// invoker.action();
	// }

	public static void main(String[] args) {

		Invoker invoker = new Invoker();
		Command command = new DeletePageCommand();// 还可以定义出肯多命令
		invoker.setCommand(command);
		invoker.action();
	}
	//......
	//只要定义出命令，然后接收、执行就可以了.
}
