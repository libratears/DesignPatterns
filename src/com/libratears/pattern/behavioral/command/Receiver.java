package com.libratears.pattern.behavioral.command;

/**
 * @ClassName: Receiver
 * @Description: 接收者，负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法
 * @date 2013-5-15 下午11:58:32
 * 
 * @author libratears
 * @version V1.0
 */
public class Receiver {

	/**
	 * 行动方法
	 */
	public void action() {
		System.out.println("Action has been taken");
	}

}
