package com.wang.ResponsibilityChainPattern.example;

import java.util.ArrayList;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		Random random = new Random();
		ArrayList<IWomen> womens = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			womens.add(new Women(random.nextInt(3), "我要出去玩"));
		}
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		father.setNext(husband);
		husband.setNext(son);
		for (IWomen women : womens) {
			father.HandleMessage(women);
			System.out.println("-------------------------------------------");
		}
	}
}
