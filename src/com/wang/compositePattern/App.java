package com.wang.compositePattern;

public class App {

	public static void main(String[] args) {
		Composite root = new Composite();// 创建一个根节点
		root.doSomething();
		Composite branch = new Composite();// 创建一个树枝构建
		Leaf leaf = new Leaf();
		// 建立树的整体
		root.add(branch);
		branch.add(leaf);
		
	    display(root);

	}

	/**
	 * 通过递归遍历树
	 * 
	 * @param root
	 */
	public static void display(Composite root) {
		for (Component c : root.getChildren()) {
			if (c instanceof Leaf) {
				c.doSomething();
			} else {
				display((Composite) c);
			}
		}
	}
}
