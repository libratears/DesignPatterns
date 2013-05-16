package com.libratears.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @ClassName: ConcreteSubject
 * @Description: 具体的被观察者
 * @date 2013-5-16 下午11:28:09
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteSubject2 extends Observable {

	/**
	 * 持有的数据
	 */
	private String _data = "";

	public String getData() {
		return _data;
	}

	/**
	 * @Title: setData
	 * @Description: 更新值，同时通知观察者
	 *
	 * @param data
	 */
	public void setData(String data) {
		this._data = data;
		// 更新
		setChanged();
		notifyObservers();
	}
}
