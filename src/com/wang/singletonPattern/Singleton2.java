package com.wang.singletonPattern;

/**
 * 懒汉式单例
 * @author HeJW
 *
 */
public class Singleton2 {

	private static Singleton2 singleton2 = null;
	
	private Singleton2(){
		System.out.println("创建Singleton2实例");
	}
	
	//如果不加synchronized关键字，线程不安全
	public static synchronized Singleton2 getSingleton2(){
		
		if( singleton2 == null ){
			singleton2 = new Singleton2();
		}
		
		return singleton2;
	}
	
}
