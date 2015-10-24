package com.wang.proxyPattern.develop.common;

import java.util.Date;

import com.wang.proxyPattern.example.IGamePlayer;

public class App {
	
	public static void main(String[] args) {
		IGamePlayer proxy = new GamePlayerProxy("张三");
		System.out.println("开始时间是：" + new Date());
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是：" + new Date());

//		//通过约定，禁止这么用
//		try {
//			GamePlayer player = new GamePlayer(proxy, "张三");
//			System.out.println("开始时间是：" + new Date());
//			player.login("zhangSan", "password");
//			player.killBoss();
//			player.upgrade();
//			System.out.println("结束时间是：" + new Date());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
