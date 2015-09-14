package com.wang.builderPattern.example;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("Bean start");
	}

	@Override
	protected void stop() {
		System.out.println("Bean stop");
	}

	@Override
	protected void alarm() {
		System.out.println("Bean alarm");
	}

	@Override
	protected void engineBoom() {
		System.out.println("Bean engineBoom");
	}
	
}
