package com.wang.iteratorPattern;

import java.util.Vector;

/**
 * 具体容器
 * 
 * @author wang
 * 
 */
public class ConcreteAggregate implements Aggregete {

	private Vector vector = new Vector(); // 容纳对象的容器
	
	@Override
	public void add(Object object) {
		this.vector.add(object);
	}

	@Override
	public void remove(Object object) {
		this.remove(object);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(vector);
	}

}
