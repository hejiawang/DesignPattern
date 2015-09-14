package com.wang.builderPattern.example;

import java.util.ArrayList;

public class App1 {
	
	public static void main(String[] args) {
		
		BenzModel benz = new BenzModel();
		
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		
		benz.setSequence(sequence);
		benz.run();
	}
	
}
