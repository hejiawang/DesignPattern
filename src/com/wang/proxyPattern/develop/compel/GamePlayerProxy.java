package com.wang.proxyPattern.develop.compel;

/**
 * ǿ�ƴ����Ĵ�����
 * @author HeJW
 *
 */
public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy(IGamePlayer gamePlayer) {
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

	@Override
	public IGamePlayer getProxy() {
		return null;
	}

}