package com.wang.commandPattern.example;

/**
 * 负责人，接受命令和执行的类
 * 
 * @author HeJW
 * 
 */
public class Invoker {

	private Command command;

	/**
	 * 接受命令
	 * 
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 执行命令
	 */
	public void action() {

		this.command.execute();
	}

}
