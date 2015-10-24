package com.wang.commandPattern.example;

/**
 * 添加需求的命令
 * 
 * @author HeJW
 * 
 */
public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		super.rg.find();
		super.rg.add();
		super.rg.plan();
	}

}
