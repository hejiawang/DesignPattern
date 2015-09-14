package com.wang.proxyPattern.develop.compel;

import java.util.Date;

public class App3 {
	
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("张三");
		IGamePlayer proxy = player.getProxy();
		System.out.println("开始时间是：" + new Date());
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是：" + new Date());
	}
}	
