package com.wang.specificationPattern;

/**
 * 抽象规格书
 * 
 * @author wang
 * 
 */
public interface ISpecification {

	/**
	 * 候选者是否满足要求
	 * 
	 * @param candidata
	 * @return
	 */
	public boolean isSatisfiedBy(Object candidata);

	/**
	 * and操作
	 * 
	 * @param spec
	 * @return
	 */
	public ISpecification and(ISpecification spec);

	/**
	 * or操作
	 * 
	 * @param spec
	 * @return
	 */
	public ISpecification or(ISpecification spec);

	/**
	 * not操作
	 * 
	 * @return
	 */
	public ISpecification not();
}
