package com.wang.factoryPattern.singleton;

import java.lang.reflect.Constructor;

/**
 * 替代单例模式的工厂类
 * @author HeJW
 *
 */
public class SingletonFactory {
	
	private static Singleton singleton;
	
	static{
		
		try{
			
			Class c1 = Class.forName(Singleton.class.getName());
			//获得无参构造函数
			Constructor constructor = c1.getDeclaredConstructor();
			//设置无参构造函数是可访问的
			constructor.setAccessible(true);
			//产生一个实例对象
			singleton = (Singleton) constructor.newInstance();
		} catch( Exception e ){
			//异常处理
		}
	}
	
	public static Singleton getSingleton(){
		return singleton;
	}
	
	
}
