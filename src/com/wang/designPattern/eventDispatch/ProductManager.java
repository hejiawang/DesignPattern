package com.wang.designPattern.eventDispatch;

/**
 * 单来源调用的产品工厂类</br>操作产品的同时会产生事件
 * 
 * @author wang
 * 
 */
public class ProductManager {

	private boolean isPermittedCreate = false; // 是否可以创建一个产品

	/**
	 * 建立一个产品
	 * 
	 * @param name
	 *            产品名称
	 * @return 产品
	 */
	public Product createProduct(String name) {

		isPermittedCreate = true;
		Product p = new Product(this, name);
		// 产生一个创建事件
		new ProductEvent(p, ProductEventType.NEW_PRODUCT);
		return p;
	}

	/**
	 * 废弃一个产品
	 * 
	 * @param p
	 *            产品
	 */
	public void abandonProduct(Product p) {
		new ProductEvent(p, ProductEventType.DEL_PRODUCT);
		p = null;
	}

	/**
	 * 修改一个产品
	 * 
	 * @param p
	 *            产品
	 * @param name
	 *            修改后的产品名产
	 */
	public void editProduct(Product p, String name) {

		new ProductEvent(p, ProductEventType.EDIT_PRODUCT);
		p.setName(name);
	}

	/**
	 * 获得是否可以创建一个产品
	 * 
	 * @return true or false
	 */
	public boolean isCreateProduct() {

		return this.isPermittedCreate;
	}

	/**
	 * 克隆一个产品
	 * 
	 * @param p
	 * @return
	 */
	public Product clone(Product p) {

		new ProductEvent(p, ProductEventType.CLONE_PRODUCT);
		return p.clone();
	}
}
