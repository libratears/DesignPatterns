package com.libratears.pattern.behavioral.command;

/**
 * @ClassName: Invoker
 * @Description: 请求者，负责调用命令对象执行请求
 * @date 2013-5-15 下午11:57:30
 * 
 * @author libratears
 * @version V1.0
 */
public class Invoker {

	/**
	 * 持有的命令对象
	 */
	private Command _command;

	/**
	 * 初始化持有的命令对象
	 * 
	 * @param command
	 *            命令对象
	 */
	public Invoker(Command command) {
		_command = command;
	}

	/**
	 * 行动方法
	 */
	public void action() {
		_command.execute();
	}

}
