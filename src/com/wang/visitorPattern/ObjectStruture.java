package com.wang.visitorPattern;

import java.util.Random;

/**
 * 结构对象
 * 
 * @author wang
 * 
 */
public class ObjectStruture {

	/**
	 * 对象生成器.</br>这里使用工厂方法模拟.
	 * 
	 * @return
	 */
	public static Element createElement() {
		Random rand = new Random();
		if (rand.nextInt(100) > 50) {
			return new ConcreteElement1();
		} else {
			return new ConcreteElement2();
		}
	}
}
