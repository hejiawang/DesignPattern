package com.wang.factoryPattern.many;

import com.wang.factoryPattern.method.Product;

/**
 * 多工厂模型的工厂接口
 * @author HeJW
 *
 */
public interface ProductFacory {
	public Product productFactory();
}
