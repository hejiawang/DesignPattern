package com.wang.builderPattern;

/**
 * 产品类,通常实现了模板方法设计模式
 * @author HeJW
 *
 */
public class Product {
	
	//独立业务处理,一般会有多个业务方法，
	//根据这些方法不同实现细节，
	//体现出建造者模式的用处
	public void doSomething(){
		System.out.println("");
	}
	
}	
