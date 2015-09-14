package com.wang.builderPattern;

/**
 * 具体建造者
 * @author HeJW
 *
 */
public class ConcerteProduct extends Builder {

	private Product product = new Product();
	
	//设置产品零件
	@Override
	public void setPart() {
		/**
		 * 产品类内的逻辑处理
		 */
	}

	@Override
	public Product builderProduct() {
		return product;
	}

}
