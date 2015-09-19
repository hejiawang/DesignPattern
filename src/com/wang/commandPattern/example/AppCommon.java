package com.wang.commandPattern.example;

/**
 * 非命令模式的客户端
 * 
 * @author HeJW
 * 
 */
public class AppCommon {

//	public static void main(String[] args) {
//		System.out.println("------------增加一个需求");
//		Group rg = new RequirementGroup();
//		rg.find();// 首先找到这个组
//		rg.add();// 增加一个需求
//		rg.plan();// 需求变更计划
//	}
	
	public static void main(String[] args) {
		System.out.println("------------删除一个一个需求");
		Group rg = new RequirementGroup();
		rg.find();// 首先找到这个组
		rg.delete();// 删除一个需求
		rg.plan();// 需求变更计划
	}
	//...........
	//等等。。还会有很多需求变更，每次变化。。。
}
