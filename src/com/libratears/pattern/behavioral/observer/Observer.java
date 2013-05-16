package com.libratears.pattern.behavioral.observer;

/**
 * @ClassName: Observer
 * @Description: 观察者接口
 * @date 2013-5-16 下午11:41:02
 * 
 * @author libratears
 * @version V1.0
 */
public interface Observer {
	
	/**
	 * @Title: update
	 * @Description: 推模型
	 *
	 * @param state
	 */
	public void update(String state);
	
	/**
	 * @Title: update
	 * @Description: 拉模型
	 *
	 * @param subject
	 */
	public void update(Subject subject);
}
