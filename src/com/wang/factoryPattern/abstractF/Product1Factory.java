package com.wang.factoryPattern.abstractF;

public class Product1Factory implements IProductFactory {

	@Override
	public AbstractProductA productAFactory() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB productBFactory() {
		return new ProductB1();
	}

}
