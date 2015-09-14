package com.wang.factoryPattern.method;

/**
 * ≤‚ ‘¿‡
 * @author HeJW
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		Factory factory = new ConcreteFactory();
		ConcreteProduct1 product1 = factory.productFactory1(ConcreteProduct1.class);
		product1.method1();
		
		ConcreteProduct2 product2 = (ConcreteProduct2) factory.productFactory2("ConcreteProduct2");
		product2.method1();
	}
	
}	
