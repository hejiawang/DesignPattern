package com.wang.builderPattern.example;

import java.util.ArrayList;

public class App2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("start");
		sequence.add("stop");
		sequence.add("engine boom");
		
		BenzBuilder benzBuiler = new BenzBuilder();
		benzBuiler.setSequence(sequence);
		BenzModel benz = (BenzModel)benzBuiler.getCarModel();
		benz.run();
		
		//按同样的顺序建造一个BMW
		BMWBuilder BMWBuiler = new BMWBuilder();
		BMWBuiler.setSequence(sequence);
		BMWModel BMW = (BMWModel)BMWBuiler.getCarModel();
		BMW.run();
	}
	
}
