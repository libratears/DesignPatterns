package com.niufish.pattern.observer;

import java.util.Observable;

/**
 * @ClassName: ConcreteSubject
 * @Description: 具体的被观察者
 * @date 2013-5-16 下午11:28:09
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteSubject extends Observable {

	/**
	 * 持有的数据
	 */
	private String _data = "";

	/**
	 * @return 持有的数据
	 */
	public String getData() {
		return _data;
	}

	/**
	 * 改值
	 * 
	 * @param data
	 *            新的值
	 */
	public void setData(String data) {
		if (!this._data.equals(data)) {
			this._data = data;
			setChanged();
		}
		notifyObservers();
	}
}
