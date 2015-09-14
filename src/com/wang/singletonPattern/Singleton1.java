package com.wang.singletonPattern;

/**
 * 恶汉式单例
 * @author HeJW
 *
 */
public class Singleton1 {
	
	private static final Singleton1 singleton1 = new Singleton1();
	
	private Singleton1(){
		System.out.println("创建Singleton1实例");
	}
	
	/*
	 * 当其他类要使用该类是，通过调用该方法，得到该类的实例，并且得到的永远都是这一个
	 */
	public static Singleton1 getSingleton1(){
		return singleton1;
	}
	
}
