package com.libratears.pattern.structural.adapter.forClass;

/**
 * @ClassName: Adapter
 * @Description: 适配器角色，此模式的核心
 * @date 2013-4-26 下午11:45:15
 * 
 * @author libratears
 * @version V1.0
 */
public class Adapter extends Adaptee implements Target {

	/**
	 * 适配后的方法
	 * 
	 * @see com.niufish.pattern.adapter.forClass.Target#request()
	 */
	public void request() {
		this.specificRequest();
	}

}
