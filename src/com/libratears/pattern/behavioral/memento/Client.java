package com.libratears.pattern.behavioral.memento;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-16 下午11:01:21
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Originator o = new Originator();
		Caretaker c = new Caretaker();
		o.setState("hello");
		c.setMemento(o.createMemento());
		o.setState("hi");
		o.restoreMemento(c.getMemento());
		System.out.println(o.getState());
	}
}
