package com.wang.factoryPattern.method;

/**
 * 工厂方法的接口
 * @author HeJW
 *
 */
public interface Factory {
	
	/*
	 * 创建一个产品对象，其输入参数类型可以自行设置
	 * 通常为String、Enum、Class等，当然也可以为空
	 */
	
	//输入类型为Class
	public <T extends Product> T productFactory1(Class<T> c);
	
	//输入类型为String
	public Product productFactory2(String product);
}
