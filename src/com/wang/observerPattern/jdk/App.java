package com.wang.observerPattern.jdk;

public class App {

	public static void main(String[] args) {
		
		Lisi lisi = new Lisi();
		HanFeizi hanFeizi = new HanFeizi();
		hanFeizi.addObserver(lisi);
		hanFeizi.haveBreakFast();
	}
}
