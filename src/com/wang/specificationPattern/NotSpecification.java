package com.wang.specificationPattern;

/**
 * 非规格书
 * 
 * @author wang
 * 
 */
public class NotSpecification extends CompositeSpecification {

	private ISpecification spec;

	public NotSpecification(ISpecification spec) {

		this.spec = spec;
	}

	@Override
	public boolean isSatisfiedBy(Object candidata) {

		return !spec.isSatisfiedBy(candidata) ;
	}

}
