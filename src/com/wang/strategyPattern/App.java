package com.wang.strategyPattern;

public class App {

	public static void main(String[] args) {

		Strategy strategy1 = new ConcreteStrategy1();
		Context context1 = new Context(strategy1);
		context1.doAnything();

		Strategy strategy2 = new ConcreteStrategy2();
		Context context2 = new Context(strategy2);
		context2.doAnything();
	}
}
