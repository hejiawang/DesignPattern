package com.wang.observerPattern.example;

import java.util.ArrayList;
import java.util.List;

public class HanFeizi implements Observable, IHanFeizi {

	private List<Observer> observerList = new ArrayList<Observer>();
	
	@Override
	public void haveBreakFast() {
		System.out.println(" 韩非子吃饭了。。。 ");
		this.notifyObserver("观察到，韩非子在吃饭。。。");
	}

	@Override
	public void haveFun() {
		System.out.println(" 韩非子娱乐了。。。 ");
		this.notifyObserver("观察到，韩非子在娱乐。。。");
	}

	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObserver(String context) {
		for( Observer o : this.observerList ){
			o.update(context);
		}
	}
}
