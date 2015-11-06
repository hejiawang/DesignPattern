package com.wang.bridgePattern;

/**
 * 具体抽象化角色
 * 
 * @author wang
 * 
 */
public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}

	@Override
	public void request() {

		super.request();
		super.getImp().doAnything();
	}

}
