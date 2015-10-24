package com.wang.adapterPattern;

public class APP {

	public static void main(String[] args) {

		Target target = new ConcreteTarget();
		target.request();

		/**
		 * 适配其他的角色
		 */
		Target targetAdapter = new Adapter();
		targetAdapter.request();
	}
}
