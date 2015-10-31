package com.wang.mementoPattern.manyState;

import java.util.HashMap;

/**
 * 备忘录角色
 * 
 * @author wang
 * 
 */
public class Memento {

	private HashMap<String, Object> stateMap;

	public Memento(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}

	public HashMap<String, Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
}
