package com.wang.specificationPattern;

/**
 * 与规格书
 * 
 * @author wang
 * 
 */
public class AndSpecification extends CompositeSpecification {

	private ISpecification left;
	private ISpecification right;

	public AndSpecification(ISpecification left, ISpecification right) {

		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isSatisfiedBy(Object candidata) {

		return left.isSatisfiedBy(candidata) && right.isSatisfiedBy(candidata);
	}

}
