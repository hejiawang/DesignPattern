package com.wang.interpreterPattern.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class App {

	/**
	 * 运行加减法
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String expStr = getExpStr();
		HashMap<String, Integer> var = getValue(expStr);
		Calculator cal = new Calculator(expStr);
		System.out.println("运算结果： " + expStr + "=" + cal.run(var));
	}

	/**
	 * 获得表达式
	 * 
	 * @return 表达式
	 * @throws Exception
	 */
	public static String getExpStr() throws Exception {
		System.out.println("请输入表达式");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	/**
	 * 获得值映射
	 * 
	 * @param expStr
	 * @return
	 * @throws Exception
	 */
	public static HashMap<String, Integer> getValue(String expStr) throws Exception {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// 解析有几个参数要传递
		for (char ch : expStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				// 解决重复参数的问题
				if (!map.containsKey(String.valueOf(ch))) {
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		return map;
	}
}
