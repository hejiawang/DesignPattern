package com.wang.flyweightPattern;

/**
 * 抽象亨元角色
 * 
 * @author wang
 * 
 */
public abstract class Flyweight {

	/*
	 * 内部状态
	 */
	private String intrinsic;

	/*
	 * 外部状态
	 */
	protected final String extrinsic;

	/**
	 * 要求亨元角色必须接受外部状态
	 * 
	 * @param extrinsic
	 *            外部状态
	 */
	public Flyweight(String extrinsic) {
		this.extrinsic = extrinsic;
	}

	/**
	 * 定义业务操作
	 */
	public abstract void operate();

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}

}
