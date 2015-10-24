package com.wang.factoryPattern.simple;

import com.wang.factoryPattern.method.Product;

/**
 * 简单工厂类
 * 就是加了个static
 * @author HeJW
 *
 */
public class SimpleFactory {
	
	public static <T extends Product> T productFactory( Class<T> c ){
		Product product = null;
		try {
			product = (Product)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return (T)product;
	} 
	
}
