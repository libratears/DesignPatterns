package com.libratears.pattern.behavioral.observer;

public class ConcreteObserver implements Observer {

	// 观察者的状态
	private String observerState;

	@Override
	public void update(String state) {
		observerState = state;
		System.out.println("(推模式)观察者状态为：" + observerState);
	}

	@Override
	public void update(Subject subject) {
		observerState = ((ConcreteSubject) subject).getState();
		System.out.println("(拉模式)观察者状态为：" + observerState);
	}

}
