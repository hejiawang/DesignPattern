package com.wang.builderPattern;

public class App {
	
	public static void main(String[] args) {
		
		Director productDirector = new Director();
		Product p = productDirector.getProduct();
		//...
	}
	
}
