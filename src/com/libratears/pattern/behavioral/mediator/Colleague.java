package com.libratears.pattern.behavioral.mediator;

/**
 * @ClassName: Colleague
 * @Description: 抽象同事角色，此对象只知道调停者而不知道其余同事对象
 * @date 2013-5-16 上午1:11:34
 * 
 * @author libratears
 * @version V1.0
 */
public abstract class Colleague {

	/**
	 * 持有的调停者对象
	 */
	private Mediator _mediator;

	/**
	 * 初始化持有的调停者对象
	 * 
	 * @param med
	 */
	public Colleague(Mediator med) {
		_mediator = med;
	}

	/**
	 * 得到调停者
	 * 
	 * @return 调停者
	 */
	public Mediator getMediator() {
		return _mediator;
	}

	/**
	 * @Title: action
	 * @Description: 动作，由子类实现
	 *
	 */
	public abstract void action();

	/**
	 * @Title: change
	 * @Description: 示意的方法，改变对象的内部状态
	 *
	 */
	public void change() {
		if (_mediator != null)
			_mediator.doSomething();
	}

}
