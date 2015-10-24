package com.wang.proxyPattern.example;

/**
 * 游戏者接口
 * @author HeJW
 *
 */
public interface IGamePlayer {

	public void login(String user, String password);
	public void killBoss();
	public void upgrade();
}
