package com.wang.mediatorPattern.before;

/**
 * 采购管理
 * 
 * @author HeJW
 * 
 */
public class Purchase {

	/**
	 * 采购电脑
	 * 
	 * @param number
	 *            电脑数量
	 */
	public void buyIBMComputer(int number) {

		Stock stock = new Stock();
		Sale sale = new Sale();
		int saleStatus = sale.getSaleStatus();
		if (saleStatus > 80) { // 销售情况好
			System.out.println("采购电脑" + number + "台");
			stock.increase(number);
		} else { // 销售情况不好
			int buyNumber = number / 2;
			System.out.println("采购电脑" + number + "台");
			stock.increase(buyNumber);
		}
	}

	/**
	 * 不再采购电脑
	 */
	public void refuseBuyIBM() {
	
		System.out.println("不再采购电脑");
	}
}
