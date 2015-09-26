package com.wang.mediatorPattern.example;

import java.util.Random;

public class Sale extends AbstractColleague {

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	public void sellIBMComputer(int number) {

		super.mediator.execute("sale.sell", number);
		System.out.println("销售电脑：" + number + "台");
	}

	public int getSaleStatus() {

		Random rand = new Random();
		int saleStatus = rand.nextInt(100);
		System.out.println("电脑销售情况为：" + saleStatus);
		return saleStatus;
	}

	public void offSale() {

		super.mediator.execute("sale.offsell");
	}

}
