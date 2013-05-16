package com.libratears.pattern.behavioral.chainOfResponsibility;

/**
 * @ClassName: Handler
 * @Description: 抽象处理者角色
 * @date 2013-5-15 下午11:32:08
 * 
 * @author libratears
 * @version V1.0
 */
public abstract class Handler {

	/**
	 * 持有的下家
	 */
	protected Handler _successor;

	/**
	 * 调用此方法处理请求
	 */
	public abstract void handleRequest();

	/**
	 * @Title: setSuccessor
	 * @Description: 设置下家
	 * 
	 * @param successor
	 *            下家
	 */
	public void setSuccessor(Handler successor) {
		_successor = successor;
	}

	/**
	 * @Title: getSuccessor
	 * @Description: 得到下家
	 * 
	 * @return 下家
	 */
	public Handler getSuccessor() {
		return _successor;
	}

}
