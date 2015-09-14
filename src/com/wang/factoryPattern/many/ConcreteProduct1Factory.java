package com.wang.factoryPattern.many;

import com.wang.factoryPattern.method.ConcreteProduct1;
import com.wang.factoryPattern.method.Product;

/**
 * ConcreteProduct1工厂的实现类
 * @author HeJW
 *
 */
public class ConcreteProduct1Factory implements ProductFacory {

	@Override
	public Product productFactory() {
		return new ConcreteProduct1();
	}

}
