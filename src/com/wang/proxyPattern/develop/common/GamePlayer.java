package com.wang.proxyPattern.develop.common;

import com.wang.proxyPattern.example.IGamePlayer;

/**
 * 普通代理的游戏者 
 * @author HeJW
 *
 */
public class GamePlayer implements IGamePlayer {

	private String name="";
	
	public GamePlayer( IGamePlayer _gamePlayer, String name ) throws Exception{
		
		if( _gamePlayer == null ){
			throw new Exception("不能创建真是角色");
		} else {
			this.name = name;
		}
	}
	
	@Override
	public void login(String user, String password) {
		System.out.println( "用户名为"+user + "的用户，"+ this.name + "登陆成功");
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "在打怪");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "又升一级");
	}

}
