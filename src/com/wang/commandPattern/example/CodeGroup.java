package com.wang.commandPattern.example;

public class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("Code------find");
	}

	@Override
	public void add() {
		System.out.println("Code------add");
	}

	@Override
	public void delete() {
		System.out.println("Code------delete");
	}

	@Override
	public void change() {
		System.out.println("Code------change");
	}

	@Override
	public void plan() {
		System.out.println("Code------plan");
	}

}
