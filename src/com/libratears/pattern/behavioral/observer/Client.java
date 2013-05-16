package com.libratears.pattern.behavioral.observer;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-16 下午11:30:43
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSubject2 cs = new ConcreteSubject2();
		cs.addObserver(new ConcreteObserver2());
		cs.setData("hello");

		// 创建主题对象
		ConcreteSubject subject = new ConcreteSubject();
		// 创建观察者对象
		Observer observer = new ConcreteObserver();
		// 将观察者对象登记到主题对象上
		subject.attach(observer);
		// 改变主题对象的状态
		subject.change("new state");
	}
}
