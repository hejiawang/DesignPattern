package com.wang.builderPattern.example;

import java.util.ArrayList;

/**
 * 导演类
 * 		制造不同组装细节的车
 * @author HeJW
 *
 */
public class Director {

	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();
	
	public BenzModel getABenzModel(){
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)benzBuilder.getCarModel();
	}
	
	public BenzModel getBBenzModel(){
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("engine boom");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)benzBuilder.getCarModel();
	}
	
	public BMWModel getABMWModel(){
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("engine boom");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel)bmwBuilder.getCarModel();
	}
	
	//........
}
