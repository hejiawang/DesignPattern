package com.wang.prototypePattern;

/**
 * 原型模式
 * @author HeJW
 *
 */
public class PrototypeClass implements Cloneable {

	public PrototypeClass(){
		System.out.println("创建");
	}
	
	@Override
	protected PrototypeClass clone() {
		
		PrototypeClass prototypeClass = null;
	
		try {
			prototypeClass = (PrototypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return prototypeClass;
		
	}
	
	
}
