package com.wang.specificationPattern;

/**
 * 业务规格书
 * 
 * @author wang
 * 
 */
public class BizSpecification extends CompositeSpecification {

	private Object obj; // 基准对象

	public BizSpecification(Object obj) {

		this.obj = obj;
	}

	@Override
	public boolean isSatisfiedBy(Object candidata) {

		// 根据基准对象和候选对象，进行业务判断，返回Boolean
		return false;
	}

}
