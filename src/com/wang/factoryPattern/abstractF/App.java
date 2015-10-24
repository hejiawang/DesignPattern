package com.wang.factoryPattern.abstractF;

public class App {
	
	public static void main(String[] args) {
		
		IProductFactory factory1 = new Product1Factory();
		IProductFactory factory2 = new Product2Factory();
		
		AbstractProductA pa1 = factory1.productAFactory();
		pa1.doSomething();
		
		AbstractProductA pa2 = factory2.productAFactory();
		pa2.doSomething();
		
		AbstractProductB pb1 = factory1.productBFactory();
		pb1.doSomething();
		
		AbstractProductB pb2 = factory2.productBFactory();
		pb2.doSomething();
	}
	
}

