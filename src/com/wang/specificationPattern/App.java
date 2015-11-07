package com.wang.specificationPattern;

import java.util.ArrayList;

/**
 * 规格模式
 * 
 * @author wang
 * 
 */
public class App {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();// 待分析对象

		/*
		 * 定义两个业务规格书
		 */
		ISpecification spec1 = new BizSpecification(new Object());
		ISpecification spec2 = new BizSpecification(new Object());

		for (Object obj : list) {
			if (spec1.and(spec2).isSatisfiedBy(obj)) {// and操作
				System.out.println(obj);
			}
		}
	}
}
