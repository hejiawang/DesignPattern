package com.wang.decoratorPattern;

public class App {
	
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		//第一次修饰
		component = new ConcreteDecorator1(component);
		//第二次修饰
		component = new ConcreteDecorator2(component);
		component.operate();
	}
}
