package com.wang.compositePattern;

/**
 * 树叶构件
 * 
 * @author wang
 * 
 */
public class Leaf extends Component {

	@Override
	public void doSomething() {
		System.out.println(" Leaf doSomething ...");
	}

	// do something
}
