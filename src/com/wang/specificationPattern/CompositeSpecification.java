package com.wang.specificationPattern;

/**
 * 组合规格书
 * 
 * @author wang
 * 
 */
public abstract class CompositeSpecification implements ISpecification {

	@Override
	public abstract boolean isSatisfiedBy(Object candidata);

	@Override
	public ISpecification and(ISpecification spec) {
		return new AndSpecification(this, spec);
	}

	@Override
	public ISpecification or(ISpecification spec) {
		return new OrSpecification(this, spec);
	}

	@Override
	public ISpecification not() {
		return new NotSpecification(this);
	}

}
