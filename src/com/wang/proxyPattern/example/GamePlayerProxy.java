package com.wang.proxyPattern.example;

/**
 * 游戏代练者
 * @author HeJW
 *
 */
public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy( IGamePlayer gamePlayer ){
		this.gamePlayer = gamePlayer;
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
