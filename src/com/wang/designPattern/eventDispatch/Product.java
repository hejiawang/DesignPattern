package com.wang.designPattern.eventDispatch;

/**
 * 产品类
 * 
 * @author wang
 * 
 */
public class Product implements Cloneable {

	private String name; // 产品 名称
	private boolean canChanged = false; // 是否可以属性变更

	/**
	 * 产生一个新的产品
	 * 
	 * @param manager
	 *            产品工厂
	 * @param name
	 *            产品名称
	 */
	public Product(ProductManager manager, String name) {

		if (manager.isCreateProduct()) { // 允许建立产品，工厂类的单来源调用
			this.canChanged = true;
			this.name = name;
		}
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		if (this.canChanged) {
			this.name = name;
		}
	}

	@Override
	public Product clone() {

		Product p = null;
		try {
			p = (Product) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
}
