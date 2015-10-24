package com.wang.factoryPattern.many;

import com.wang.factoryPattern.method.ConcreteProduct1;

public class App {
	public static void main(String[] args) {
		ProductFacory factory = new ConcreteProduct1Factory();
		ConcreteProduct1 product1 = (ConcreteProduct1) factory.productFactory();
		product1.method1();
	}
}
