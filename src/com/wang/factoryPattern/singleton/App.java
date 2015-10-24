package com.wang.factoryPattern.singleton;

public class App {
	
	public static void main(String[] args) {
		Singleton singleton1 = SingletonFactory.getSingleton();
		singleton1.method();
		
		Singleton singleton2 = SingletonFactory.getSingleton();
		singleton2.method();
	}
	
}
