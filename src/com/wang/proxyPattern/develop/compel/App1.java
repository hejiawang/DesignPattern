package com.wang.proxyPattern.develop.compel;

import java.util.Date;

public class App1 {
	
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
		System.out.println("开始时间是：" + new Date());
		player.login("zhangSan", "password");
		player.killBoss();
		player.upgrade();
		System.out.println("结束时间是：" + new Date());
	}
}	
