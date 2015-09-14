package com.wang.builderPattern.example;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{

	private BMWModel BMW = new BMWModel();
	
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.BMW.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.BMW;
	}

	
}
