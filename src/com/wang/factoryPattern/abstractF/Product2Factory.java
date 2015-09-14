package com.wang.factoryPattern.abstractF;

public class Product2Factory implements IProductFactory {

	@Override
	public AbstractProductA productAFactory() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB productBFactory() {
		return new ProductB2();
	}

}
