package com.wang.proxyPattern.develop.compel;

/**
 * 强制代理的真是角色
 * @author HeJW
 *
 */
public class GamePlayer implements IGamePlayer {

	private String name = null;
	
	//代理类
	private IGamePlayer proxy = null;
	
	public GamePlayer(String name) {
		this.name = name;
	}
	
	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return proxy;
	}
	
	@Override
	public void login(String user, String password) {
		
		if (this.isProxy()) {
			System.out.println( "用户名为"+user + "的用户，"+ this.name + "登陆成功");
		} else {
			System.out.println("请使用指定的代理类");
		}
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "在打怪");
		} else {
			System.out.println("请使用指定的代理类");
		}
	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "又升一级");
		} else {
			System.out.println("请使用指定的代理类");
		}
	}
	
	private boolean isProxy(){
		
		if( this.proxy == null ){
			return false;
		} else {
			return true;
		} 
	}

	

}
