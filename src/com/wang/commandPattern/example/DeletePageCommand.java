package com.wang.commandPattern.example;

/**
 * É¾³ıÒ³ÃæµÄÃüÁî
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
