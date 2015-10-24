package com.wang.ResponsibilityChainPattern.example;

public abstract class Handler {

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;

	// 能处理的级别
	private int level = 0;

	// 责任传递，下一个责任人是谁
	private Handler nextHandler;

	// 每个类都要说明自己能够处理的级别
	public Handler(int level) {
		this.level = level;
	}

	// 处理一个女性（女儿，妻子，母亲）请求逛街的请求
	public final void HandleMessage(IWomen women) {

		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHandler != null) {
				this.nextHandler.HandleMessage(women);
			} else {
				// 没有能够处理请求的人了，自行处理
				System.out.println("没地方请示了，按同意处理");
			}
		}
	}

	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	protected abstract void response(IWomen women);
}
