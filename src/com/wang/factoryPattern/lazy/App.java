package com.wang.factoryPattern.lazy;

import com.wang.factoryPattern.method.ConcreteProduct1;

public class App {
	
	public static void main(String[] args) {
		ConcreteProduct1 product1 = (ConcreteProduct1) LazyProductFactory.ProductFactory("ConcreteProduct1");
		product1.method1();
		
		//当此次创建ConcreteProduct1时，是从map中取出的。
		ConcreteProduct1 product2 = (ConcreteProduct1) LazyProductFactory.ProductFactory("ConcreteProduct1");
		product2.method1();
	}
	
}
