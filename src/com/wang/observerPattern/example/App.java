package com.wang.observerPattern.example;

public class App {
	
	public static void main(String[] args) {
		
		Observer Lisi = new Lisi();
		Observer Lisi2 = new Lisi2();
		
		HanFeizi hanFeizi = new HanFeizi();
		hanFeizi.addObserver(Lisi);
		hanFeizi.addObserver(Lisi2);
		
		hanFeizi.haveBreakFast();
	}
}
