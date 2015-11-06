package com.wang.flyweightPattern;

import java.util.HashMap;

/**
 * 亨元工厂
 * 
 * @author wang
 * 
 */
public class FlyweightFactory {

	/*
	 * 定义一个容量池
	 */
	private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

	public static Flyweight getFlyweight(String extrinsic) {
		
		// 需要返回的对象
		Flyweight flyweight = null;
		/*
		 * 如果池中有该对象，从池中取；
		 * 如果池中没有该对象，创建一个对象，并放到池中。
		 */
		if( pool.containsKey(extrinsic) ){
			flyweight = pool.get(extrinsic);
		} else {
			flyweight = new ConcreteFlyweight1(extrinsic);
			pool.put(extrinsic, flyweight);
		}
		return flyweight;
	}
}
