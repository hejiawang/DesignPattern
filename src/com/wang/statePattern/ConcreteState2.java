package com.wang.statePattern;

public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		// 设置当前状态为state1
		super.context.setCurrentState(Context.STATE1);
		// 过渡到state1状态，由Context实现
		super.context.handle1();
	}

	@Override
	public void handle2() {
		// 本状态必须处理的逻辑
		System.out.println("ConcreteState2...handle2");
	}
}
