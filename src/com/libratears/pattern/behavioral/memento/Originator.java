package com.libratears.pattern.behavioral.memento;

/**
 * @ClassName: Originator
 * @Description: 发起人角色，创建一个含有当前的内部状态的备忘录对象，使用备忘录对象存储其内部状态
 * @date 2013-5-16 下午10:59:12
 * 
 * @author libratears
 * @version V1.0
 */
public class Originator {

	/**
	 * 状态
	 */
	private String _state;

	public String getState() {
		return _state;
	}

	public void setState(String _state) {
		this._state = _state;
		System.out.println("current state:" + _state);
	}

	/**
	 * @Title: createMemento
	 * @Description: 工厂方法，创建备忘录对象
	 * 
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(_state);
	}

	/**
	 * @Title: restoreMemento
	 * @Description: 恢复到备忘录对象所记载的状态
	 * 
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		_state = memento.getState();
	}

}
