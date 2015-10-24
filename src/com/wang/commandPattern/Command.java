package com.wang.commandPattern;

/**
 * 抽象命令
 * @author HeJW
 *
 */
public abstract class Command {

	/**
	 * 每个命令都必须有一个执行命令的方法
	 */
	public abstract void execute();
}
