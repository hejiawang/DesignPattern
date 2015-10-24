package com.wang.proxyPattern.develop.compel;

/**
 * 强制代理的接口类
 * @author HeJW
 *
 */
public interface IGamePlayer {

	public void login(String user, String password);
	public void killBoss();
	public void upgrade();	

	//每个人都可以找到自己的代理类
	public IGamePlayer getProxy();
}
