package com.wang.proxyPattern.develop.common;

import com.wang.proxyPattern.example.IGamePlayer;

/**
 * 普通代理的代理者
 * @author HeJW
 *
 */
public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy( String name ){
		try {
			gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
