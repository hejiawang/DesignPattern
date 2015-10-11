package com.wang.iteratorPattern;

import java.util.Vector;

/**
 * 具体迭代器
 * 
 * @author wang
 * 
 */
public class ConcreteIterator implements Iterator {

	private Vector vector = new Vector();
	public int cursor; // 定义当前游标
	
	public ConcreteIterator(Vector vector) {
		this.vector = vector;
	}

	@Override
	public Object next() {
		
		Object result = null;
		if( this.hasNext() ){
			result = this.vector.get(this.cursor++);
		} else {
			result = null;
		}
		
		return result;
	}

	@Override
	public boolean hasNext() {
		
		if( this.cursor == this.vector.size() ){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean remove() {
		this.vector.remove(this.cursor);
		return true;
	}

}
