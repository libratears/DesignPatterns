package com.libratears.pattern.structural.adapter.forClass;

/**
 * @ClassName: Adaptee
 * @Description: 待适配角色，现有需要适配的接口
 * @date 2013-4-26 下午11:43:39
 * 
 * @author libratears
 * @version V1.0
 */
public class Adaptee {

	/**
	 * 待适配的方法
	 */
	public void specificRequest() {
		System.out.println("Adaptee work");
	}

}
