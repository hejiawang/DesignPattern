package com.wang.factoryPattern.abstractF;

/**
 * 抽象工厂定义
 * @author HeJW
 *
 */
public interface IProductFactory {
	
	//A系类产品工厂
	public AbstractProductA productAFactory();
	
	//B系类产品工厂
	public AbstractProductB productBFactory();
}
