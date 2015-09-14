package com.wang.proxyPattern.develop.compel;

import java.util.Date;

public class App2 {
	
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("张三");
		IGamePlayer proxy = new GamePlayerProxy(player);
		System.out.println("开始时间是：" + new Date());
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是：" + new Date());
	}
}	
