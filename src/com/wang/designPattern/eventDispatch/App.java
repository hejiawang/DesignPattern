package com.wang.designPattern.eventDispatch;

public class App {

	public static void main(String[] args) {

		EventDispatch dispatch = EventDispatch.getEventDispatch();// 获得事件分发中心

		/*
		 * 接受乞丐、平明、贵族对事件的处理
		 */
		dispatch.registerCustomer(new Beggar());
		dispatch.registerCustomer(new Commoner());
		dispatch.registerCustomer(new Noblemen());

		ProductManager factory = new ProductManager();

		System.out.println("=====模拟创建产品事件===========");
		System.out.println("创建一个叫小男孩的原子弹");
		Product p = factory.createProduct("小男孩原子弹");

		System.out.println("=====模拟修改产品事件===========");
		System.out.println("把小男孩原子弹修改成胖子号原子弹");
		factory.editProduct(p, "胖子号原子弹");

		System.out.println("=====模拟克隆产品事件===========");
		System.out.println("克隆胖子号原子弹");
		factory.clone(p);

		System.out.println("=====模拟销毁产品事件===========");
		System.out.println("遗弃胖子号原子弹");
		factory.abandonProduct(p);
	}
}
