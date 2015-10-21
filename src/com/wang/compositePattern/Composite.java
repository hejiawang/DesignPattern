package com.wang.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件
 * 
 * @author wang
 * 
 */
public class Composite extends Component {

	/**
	 * 构件容器
	 */
	private List<Component> componentList = new ArrayList<Component>();

	/**
	 * 添加一个叶子构件或者树枝构件
	 * 
	 * @param component
	 */
	public void add(Component component) {
		this.componentList.add(component);
	}

	/**
	 * 删除一个叶子构件或者树枝构件
	 * 
	 * @param component
	 */
	public void remove(Component component) {
		this.componentList.remove(component);
	}
	
	/**
	 * 获得分支下的所有叶子构件或者树枝构件
	 * @return
	 */
	public List<Component> getChildren(){
		return this.componentList;
	}

}
