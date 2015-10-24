package com.wang.commandPattern;

public class ConcreteCommand1 extends Command {

	// 让谁干活
	private Receiver receiver;

	/**
	 * 通过构造函数，传递干活的“人”
	 * 
	 * @param receiver
	 */
	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}

	/**
	 * 这个命令要做什么事
	 */
	@Override
	public void execute() {
	
		receiver.doSomthing1();
		receiver.doSomthing2();
	}

}
