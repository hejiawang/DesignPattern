package com.wang.observerPattern.jdk;

import java.util.Observable;

public class HanFeizi extends Observable implements  IHanFeizi {

	@Override
	public void haveBreakFast() {
		System.out.println("韩非子吃饭了。。。");
		super.setChanged();
		super.notifyObservers("韩非子在吃饭");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子娱乐了。。。");
		super.setChanged();
		super.notifyObservers("韩非子在娱乐");
	}
}
