package com.wang.specificationPattern;

/**
 * 或规格书
 * 
 * @author wang
 * 
 */
public class OrSpecification extends CompositeSpecification {

	private ISpecification left;
	private ISpecification right;

	public OrSpecification(ISpecification left, ISpecification right) {

		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isSatisfiedBy(Object candidata) {

		return left.isSatisfiedBy(candidata) || right.isSatisfiedBy(candidata);
	}

}
