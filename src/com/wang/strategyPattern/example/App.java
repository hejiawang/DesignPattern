package com.wang.strategyPattern.example;

public class App {

	public static void main(String[] args) {

		Context contextAdd = new Context(new Add());
		int add = contextAdd.exec(2, 3);
		System.out.println(add);

		Context contextSub = new Context(new Sub());
		int sub = contextSub.exec(2, 3);
		System.out.println(sub);
	}
}
