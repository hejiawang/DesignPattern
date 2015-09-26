package com.wang.mediatorPattern.before;

/**
 * 库存管理
 * 
 * @author HeJW
 * 
 */
public class Stock {

	private static int COMPUTER_NUMBER = 100;

	/**
	 * 库存增加
	 * 
	 * @param number
	 *            库存量
	 */
	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("库存数量为" + COMPUTER_NUMBER);
	}

	/**
	 * 库存降低
	 * 
	 * @param number
	 *            库存量
	 */
	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("库存数量为" + COMPUTER_NUMBER);
	}

	/**
	 * 获得库存数量
	 * 
	 * @return 库存数量
	 */
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	/**
	 * 存货压力大，通知采购人员不要采购，销售人员尽快销售
	 */
	public void clearStock() {

		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
		sale.offSale();
		purchase.refuseBuyIBM();
	}
}
