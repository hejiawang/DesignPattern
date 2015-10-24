package com.wang.singletonPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * 单例模式扩展，生成指定数量的实例
 * @author HeJW
 *
 */
public class SingletonDevelop {

	//定义最多能生产两个实例
	private static int maxNum = 2;
	
	//定义一个列表，容纳多有的实例
	private static ArrayList<SingletonDevelop> singletonDeveloplist = new ArrayList<SingletonDevelop>();
	
	//产生指定数量的实例对象
	static{
		for( int i=0; i<maxNum; i++ ){
			singletonDeveloplist.add(new SingletonDevelop());
		}
	}
	
	private SingletonDevelop(){
		System.out.println("创建SingletonDevelop实例");
	}
	
	//得到随机的SingletonDevelop实例
	public static SingletonDevelop getSingletonDevelop(){
		Random randrom = new Random();
		int singletonDevelopNum = randrom.nextInt(maxNum);
		return singletonDeveloplist.get(singletonDevelopNum);
	}
	
}
