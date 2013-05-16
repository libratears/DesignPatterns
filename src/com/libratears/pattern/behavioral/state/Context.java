package com.libratears.pattern.behavioral.state;

/**
 * @ClassName: Context
 * @Description: 环境角色
 * @date 2013-5-17 上午12:00:41
 * 
 * @author libratears
 * @version V1.0
 */
public class Context {

	/**
	 * 持有的状态
	 */
	private State _state;

	/**
	 * 某些操作
	 */
	public void request() {
		_state.handle();
	}

	/**
	 * 改变状态
	 * 
	 * @param state
	 *            状态
	 */
	public void setState(State state) {
		_state = state;
	}

}
