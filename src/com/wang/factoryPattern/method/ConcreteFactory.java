package com.wang.factoryPattern.method;

/**
 * 具体工厂类
 * @author HeJW
 *
 */
public class ConcreteFactory implements Factory {
	
	@Override
	public <T extends Product> T productFactory1(Class<T> c) {
		
		Product product1 = null;
		try {
			product1 = (Product)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			//异常处理
		} 
		
		return (T)product1;
	}

	@Override
	public Product productFactory2(String product) {
		Product product2 = null;
		
		if( product.equals("ConcreteProduct1") ){
			product2 = new ConcreteProduct1();
		} else {
			product2 = new ConcreteProduct2();
		}
		
		return product2;
	}

}
