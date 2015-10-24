package com.wang.decoratorPattern;

/**
 * 抽象装饰者
 * 
 * @author HeJW
 * 
 */
public abstract class Decorator extends Component {

	private Component component = null;

	/**
	 * 通过构造函数传递被修饰者
	 * 
	 * @param component
	 *            被修饰的构件
	 */
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operate() {

		this.component.operate();
	}

}
