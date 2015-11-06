package com.wang.flyweightPattern;

/**
 * 具体亨元角色
 * 
 * @author wang
 * 
 */
public class ConcreteFlyweight1 extends Flyweight {

	public ConcreteFlyweight1(String extrinsic) {
		super(extrinsic);
	}

	@Override
	public void operate() {
		System.out.println("ConcreteFlyweight1 ... operate...");
	}

}
