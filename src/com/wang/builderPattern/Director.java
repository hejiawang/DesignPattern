package com.wang.builderPattern;

/**
 * 导演类
 * @author HeJW
 *
 */
public class Director {

	private Builder builder = new ConcerteProduct();
	
	//构造不同的产品
	public Product getProduct(){
		/*
		 * 设置不同的零件，产生不同的产品
		 */
		builder.setPart();
		return builder.builderProduct();
	}
	
}
