package com.wang.decoratorPattern;

/**
 * 具体构建
 * 
 * @author HeJW
 * 
 */
public class ConcreteComponent extends Component {

	@Override
	public void operate() {

		System.out.println("do Something");
	}

}
