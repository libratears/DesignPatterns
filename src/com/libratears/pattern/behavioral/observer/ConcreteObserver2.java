package com.libratears.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: ConcreteObserver
 * @Description: 具体观察者
 * @date 2013-5-16 下午11:26:36
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteObserver2 implements Observer {

	/**
	 * 更新自己
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable o, Object arg) {
		System.out.println("Data has been changed to:"
				+ ((ConcreteSubject2) o).getData());
	}

}
