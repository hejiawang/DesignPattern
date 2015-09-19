package com.wang.commandPattern.example;

public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("Page------find");
	}

	@Override
	public void add() {
		System.out.println("Page------add");
	}

	@Override
	public void delete() {
		System.out.println("Page------delete");
	}

	@Override
	public void change() {
		System.out.println("Page------change");
	}

	@Override
	public void plan() {
		System.out.println("Page------plan");
	}

}
