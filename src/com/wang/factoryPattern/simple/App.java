package com.wang.factoryPattern.simple;

import com.wang.factoryPattern.method.ConcreteProduct1;

/**
 * 简单工厂测试类
 * @author HeJW
 *
 */
public class App {

	public static void main(String[] args) {
		ConcreteProduct1 product1 = SimpleFactory.productFactory(ConcreteProduct1.class);
		product1.method1();
	}

}
