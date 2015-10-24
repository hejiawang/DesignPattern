package com.wang.builderPattern.example;

public class App3 {
	
	public static void main(String[] args) {
		
		Director director = new Director();
		
		director.getABMWModel().run();
		director.getABenzModel().run();
	}
	
}
