package com.wang.prototypePattern.develop;

import java.util.ArrayList;

/**
 * 浅拷贝
 * 
 * @author HeJW
 * 
 */
public class QianClone implements Cloneable {

	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	protected QianClone clone() {

		QianClone qian = null;
		try {
			qian = (QianClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return qian;
	}
	
	public void setValue( String value ){
		this.arrayList.add(value);
	}
	
	public ArrayList<String> getValue(){
		return this.arrayList;
	}
	
	public static void main(String[] args) {
		
		QianClone qian = new QianClone();
		qian.setValue("张三");
		
		QianClone qianClone = qian.clone();
		qianClone.setValue("李四");
		
		System.out.println(qian.getValue());
	}

}