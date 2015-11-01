package com.wang.statePattern;

/**
 * 具体环境角色
 * 
 * @author wang
 * 
 */
public class Context {

	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();

	// 当前状态
	private State currentState;

	/**
	 * 获得当前状态
	 * 
	 * @return
	 */
	public State getCurrentState() {
		return currentState;
	}

	/**
	 * 设置当前状态
	 * 
	 * @param currentState
	 *            当前状态
	 */
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		// 切换状态
		this.currentState.setContext(this);
	}

	/**
	 * 行为委托1
	 */
	public void handle1() {
		this.currentState.handle1();
	}

	/**
	 * 行为委托2
	 */
	public void handle2() {
		this.currentState.handle2();
	}

}
