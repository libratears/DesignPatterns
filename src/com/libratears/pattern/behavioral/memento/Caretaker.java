package com.libratears.pattern.behavioral.memento;

/**
 * @ClassName: Caretaker
 * @Description: 负责人角色，负责保存备忘录对象，不检查备忘录对象内容
 * @date 2013-5-16 下午10:58:19
 * 
 * @author libratears
 * @version V1.0
 */
public class Caretaker {

	/**
	 * 持有的备忘录对象
	 */
	private Memento _memento;

	public Memento getMemento() {
		return _memento;
	}

	public void setMemento(Memento memento) {
		this._memento = memento;
	}

}
