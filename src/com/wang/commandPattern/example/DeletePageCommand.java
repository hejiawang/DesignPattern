package com.wang.commandPattern.example;

/**
 * 删除页面的命令
 * 
 * @author HeJW
 * 
 */
public class DeletePageCommand extends Command {

	@Override
	public void execute() {
		super.pg.find();
		super.pg.delete();
		super.pg.plan();
	}

}
