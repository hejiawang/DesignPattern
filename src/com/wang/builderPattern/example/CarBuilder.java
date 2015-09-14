package com.wang.builderPattern.example;

import java.util.ArrayList;

/**
 * 抽象汽车组装者
 * @author HeJW
 *
 */
public abstract class CarBuilder {
	
	//组装顺序
	public abstract void setSequence(ArrayList<String> sequence);
	
	//组装之后，得到车辆模型
	public abstract CarModel getCarModel();
}
