package com.wang.iteratorPattern;

/**
 * 抽象容器
 * 
 * @author wang
 * 
 */
public interface Aggregete {

	/**
	 * 添加元素
	 * 
	 * @param object
	 */
	public void add(Object object);

	/**
	 * 移除元素
	 * 
	 * @param object
	 */
	public void remove(Object object);

	/**
	 * 由迭代器遍历所有元素
	 * 
	 * @return
	 */
	public Iterator iterator();
}
