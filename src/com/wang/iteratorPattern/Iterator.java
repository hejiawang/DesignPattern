package com.wang.iteratorPattern;

/**
 * 抽象迭代器
 * 
 * @author wang
 * 
 */
public interface Iterator {

	/**
	 * 遍历下一个元素
	 * 
	 * @return
	 */
	public Object next();

	/**
	 * 是否遍历到尾部
	 * 
	 * @return
	 */
	public boolean hasNext();

	/**
	 * 删除当前指定的元素
	 * 
	 * @return
	 */
	public boolean remove();
}
