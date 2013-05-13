package com.libratears.pattern.structural.adapter.forObject;

import com.libratears.pattern.structural.adapter.forClass.Adaptee;
import com.libratears.pattern.structural.adapter.forClass.Target;

/**
 * @ClassName: Adapter
 * @Description: 适配器角色，与类适配器有所区别
 * @date 2013-4-26 下午11:47:32
 * 
 * @author libratears
 * @version V1.0
 */
public class Adapter implements Target {

	/**
	 * 持有的待适配对象
	 */
	private Adaptee _adaptee;

	/**
	 * 初始化持有的适配对象
	 * 
	 * @param adaptee
	 *            适配对象
	 */
	public Adapter(Adaptee adaptee) {
		_adaptee = adaptee;
	}

	/**
	 * @see com.libratears.pattern.structural.adapter.forClass.Target#request()
	 */
	public void request() {
		_adaptee.specificRequest();
	}

}
