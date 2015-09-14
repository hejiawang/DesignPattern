package com.wang.templatePattern.develop;

public class App {
	
	public static void main(String[] args) {
		
		ConcreteClass1 class1 = new ConcreteClass1();
		//²»Ö´ÐÐ
		class1.setCondition(false);
		class1.templateMethod();
		
		AbstractClass class2 = new ConcreteClass2();
		class2.templateMethod();
	
	}
	
}
