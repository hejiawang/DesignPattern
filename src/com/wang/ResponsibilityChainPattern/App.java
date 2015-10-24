package com.wang.ResponsibilityChainPattern;

/**
 * 责任链模式场景类
 * 
 * @author HeJW
 * 
 */
public class App {

	public static void main(String[] args) {

		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();

		handler1.setNext(handler2);
		handler2.setNext(handler3);

		Response response = handler1.handleMessage(new Request());
	}
}
