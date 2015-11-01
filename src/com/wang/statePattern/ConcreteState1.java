package com.wang.statePattern;

public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		//本状态必须处理的逻辑
		System.out.println("ConcreteState1...handle1");
	}

	@Override
	public void handle2() {
		//设置当前状态为state2
		super.context.setCurrentState(Context.STATE2);
		//过渡到state2状态，由Context实现
		super.context.handle2();
	}
}
