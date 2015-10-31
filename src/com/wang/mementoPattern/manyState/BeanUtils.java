package com.wang.mementoPattern.manyState;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * 一个工具类.</br> 把一个对象的所有属性以及数值放入到HashMap中.</br>把取出的属性返回对象中.
 * 
 * @author wang
 * 
 */
public class BeanUtils {

	/**
	 * 把bean的所有属性以及数值放入到HashMap中
	 * 
	 * @param object
	 * @return
	 */
	public static HashMap<String, Object> backupProp(Object bean) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			// 获得bean描述
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			// 获得属性描述
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			// 遍历所有属性
			for (PropertyDescriptor des : descriptors) {
				// 属性名
				String fieldName = des.getName();
				// 读取属性的方法
				Method getter = des.getReadMethod();
				// 读取属性值
				Object fieldValue = getter.invoke(bean, new Object[] {});
				if (!fieldName.equalsIgnoreCase("class")) {
					result.put(fieldName, fieldValue);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 把HashMap中的值返回到bean中.
	 * 
	 * @param bean
	 * @param propMap
	 */
	public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
		try {
			// 获得bean描述
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			// 获得属性描述
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			// 遍历所有属性
			for (PropertyDescriptor des : descriptors) {
				// 属性名
				String fieldName = des.getName();
				// 如果有这个属性
				if (propMap.containsKey(fieldName)) {
					Method setter = des.getWriteMethod();
					setter.invoke(bean, new Object[]{propMap.get(fieldName)});
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
