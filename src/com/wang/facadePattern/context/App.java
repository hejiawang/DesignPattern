package com.wang.facadePattern.context;

public class App {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
		facade.methodC();
		facade.methodComplex();
	}
}
