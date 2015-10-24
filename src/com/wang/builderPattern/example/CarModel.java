package com.wang.builderPattern.example;

import java.util.ArrayList;

/**
 * 车辆模型的抽象类(用到了模板设计模式)
 * @author HeJW
 *
 */
public abstract class CarModel {

	//存储各个基本方法的执行顺序
	private ArrayList<String> sequence = new ArrayList<String>();
	
	//基本方法
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void engineBoom();
	
	final public void run(){
		
		for ( int i=0; i<this.sequence.size(); i++ ) {
			
			String actionName = this.sequence.get(i);
			if ( actionName.equalsIgnoreCase("start") ) {
				this.start();
			} else if ( actionName.equalsIgnoreCase("stop") ) {
				this.stop();
			} else if ( actionName.equalsIgnoreCase("alarm") ) {
				this.alarm();
			} else if ( actionName.equalsIgnoreCase("engine boom") ) {
				this.engineBoom();
			}
			
		}
		
	}
	
	final public void setSequence( ArrayList<String> sequence ){
		this.sequence = sequence;
	}
	
}
