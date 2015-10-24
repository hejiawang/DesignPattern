package com.wang.mediatorPattern.before;

import java.util.Random;

/**
 * 销售管理
 * 
 * @author HeJW
 * 
 */
public class Sale {

	/**
	 * 销售电脑
	 * 
	 * @param number
	 */
	public void sellIBMComputer(int number) {

		Stock stock = new Stock();
		Purchase purchase = new Purchase();
		if (stock.getStockNumber() < number) { // 库存数量不够销售
			purchase.buyIBMComputer(number);
		}
		System.out.println("销售电脑：" + number + "台");
		stock.decrease(number);
	}

	/**
	 * 反馈销售情况
	 * 
	 * @return
	 */
	public int getSaleStatus() {

		Random rand = new Random();
		int saleStatus = rand.nextInt(100);
		System.out.println("电脑销售情况为：" + saleStatus);
		return saleStatus;
	}

	/**
	 * 折价处理
	 */
	public void offSale() {

		Stock stock = new Stock();
		System.out.println("折半销售电脑" + stock.getStockNumber() + "台");
	}
}
