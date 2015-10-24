package com.wang.mediatorPattern.example;

public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	
	public void buyIBMComputer(int number) {
		//自己不能独立完成的任务交个中介者完成
		super.mediator.execute("purchase.buy", number);
	}
	
	public void refuseBuyIBM() {
		
		System.out.println("不再采购电脑");
	}
}
