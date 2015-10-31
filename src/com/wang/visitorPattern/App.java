package com.wang.visitorPattern;

public class App {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// 获得元素对象
			Element el = ObjectStruture.createElement();
			// 接受访问者
			el.accept(new Visitor());
		}
	}
}
