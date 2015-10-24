package com.wang.factoryPattern.singleton;

/**
 * 单例类
 * @author HeJW
 *
 */
public class Singleton {
	
	private Singleton(){
		//不允许通过New，产生一个对象
		System.out.println("singleton 创建");
	};
	
	public void method(){
		System.out.println("singleton 输出");
	}
}
