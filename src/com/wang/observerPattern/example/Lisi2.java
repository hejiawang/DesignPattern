package com.wang.observerPattern.example;

import com.wang.observerPattern.example.Observer;

/**
 * 具体观察者李斯
 * @author wang
 *
 */
public class Lisi2 implements Observer {

	@Override
	public void update(String context) {
		System.out.println("李斯2观察到了 。。" + context);
	}
}
