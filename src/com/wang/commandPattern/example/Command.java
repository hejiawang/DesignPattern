package com.wang.commandPattern.example;

/**
 * 抽象命令类
 * 
 * @author HeJW
 * 
 */
public abstract class Command {

	protected RequirementGroup rg = new RequirementGroup();
	protected PageGroup pg = new PageGroup();
	protected CodeGroup cg = new CodeGroup();
	
	/**
	 * 要做什么事
	 */
	public abstract void execute();

}
