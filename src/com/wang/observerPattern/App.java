package com.wang.observerPattern;

public class App {
	
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		Observer obs = new ConcreteObject();
		subject.addObserver(obs);
		subject.doSomething();
	}
}
