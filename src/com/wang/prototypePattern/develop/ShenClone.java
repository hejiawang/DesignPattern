package com.wang.prototypePattern.develop;

import java.util.ArrayList;

/**
 * 深拷贝
 * 
 * @author HeJW
 * 
 */
public class ShenClone implements Cloneable {

	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	protected ShenClone clone() {

		ShenClone shen = null;
		try {
			shen = (ShenClone) super.clone();
			//比浅拷贝多了一句话。。。
			shen.arrayList = (ArrayList<String>)this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return shen;
	}
	
	public void setValue( String value ){
		this.arrayList.add(value);
	}
	
	public ArrayList<String> getValue(){
		return this.arrayList;
	}
	
	public static void main(String[] args) {
		
		ShenClone shen = new ShenClone();
		shen.setValue("张三");
		
		ShenClone shenClone = shen.clone();
		shenClone.setValue("李四");
		
		System.out.println(shen.getValue());
	}

}