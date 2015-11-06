package com.wang.flyweightPattern.example;

/**
 * String类中的亨元模式
 * 
 * @author wang
 *
 */
public class StringIntern {

	public static void main(String[] args) {

		String str1 = "和谐";
		String str2 = "社会";
		String str3 = "和谐社会";
		String str4;
		str4 = str1 + str2;
		System.out.println(str3 == str4);
		/*
		 * String类中的intern()方法，
		 * 如果是String的对象池中有该类型的值，
		 * 则直接返回对象池中的对象
		 */
		str4 = (str1 + str2).intern();
		System.out.println(str3 == str4);
	}
}
