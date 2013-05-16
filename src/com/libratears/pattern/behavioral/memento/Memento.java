package com.libratears.pattern.behavioral.memento;

/**
 * @ClassName: MementoIF
 * @Description: 备忘录的窄接口
 * @date 2013-5-16 下午11:00:45
 * 
 * @author libratears
 * @version V1.0
 */
public class Memento {
	
	/** 
	 * @Fields state: 要保存的状态
	 */
	private String state;
	
	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
