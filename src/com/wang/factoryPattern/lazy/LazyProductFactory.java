package com.wang.factoryPattern.lazy;

import java.util.HashMap;
import java.util.Map;

import com.wang.factoryPattern.method.ConcreteProduct1;
import com.wang.factoryPattern.method.ConcreteProduct2;
import com.wang.factoryPattern.method.Product;

/**
 * 延时初始化的工厂类
 * @author HeJW
 *
 */
public class LazyProductFactory {
	
	private static final Map<String, Product> prMap = new HashMap<String, Product>();
	
	public static synchronized Product ProductFactory(String type){
		Product product = null;
		
		//如果Map中已经有这个对象
		if ( prMap.containsKey(type) ) {
			product = prMap.get(type);
		} else {
		
			if( type.equals("ConcreteProduct1") ){
				product = new ConcreteProduct1();
			} else if (type.equals("ConcreteProduct2")) {
				product = new ConcreteProduct2();
			}
			
			//同时把对象放到缓存容器中
			prMap.put(type, product);
			
		}
		
		return product;
	}
	
}
