package com.wang.observerPattern.jdk;

import java.util.Observable;
import java.util.Observer;

public class Lisi implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("有敌情： " + arg.toString());
	}

}
