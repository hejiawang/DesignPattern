package com.wang.observerPattern.example;

import com.wang.observerPattern.example.Observer;

/**
 * 具体观察者李斯
 * @author wang
 *
 */
public class Lisi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("李斯观察到了 。。" + context);
	}
}
