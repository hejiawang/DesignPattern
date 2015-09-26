package com.wang.mediatorPattern.example;

/**
 * 具体中介者
 * 
 * @author HeJW
 * 
 */
public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... object) {

		if (str.equals("purchase.buy")) {
			this.buyComputer((Integer) object[0]);
		} else if (str.equals("sale.sell")) {
			this.sellComputer((Integer) object[0]);
		} else if (str.equals("sale.offsell")) {
			this.offSell();
		} else if (str.equals("stock.clear")) {
			this.clearStock();
		}
	}

	/**
	 * 采购电脑
	 * 
	 * @param number
	 */
	private void buyComputer(int number) {

		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) { // 销售情况好
			System.out.println("采购电脑" + number + "台");
			super.stock.increase(number);
		} else { // 销售情况不好
			int buyNumber = number / 2;
			System.out.println("采购电脑" + number + "台");
			super.stock.increase(buyNumber);
		}
	}

	/**
	 * 销售电脑
	 * 
	 * @param number
	 */
	private void sellComputer(int number) {

		if (stock.getStockNumber() < number) { // 库存数量不够销售
			super.purchase.buyIBMComputer(number);
		}
		System.out.println("销售电脑：" + number + "台");
		super.stock.decrease(number);
	}

	/**
	 * 折价销售电脑
	 */
	private void offSell() {
		System.out.println("折半销售电脑" + super.stock.getStockNumber() + "台");
	}

	/**
	 * 清仓处理
	 */
	private void clearStock() {

		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}

}
