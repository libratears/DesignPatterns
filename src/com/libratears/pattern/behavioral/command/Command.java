package com.libratears.pattern.behavioral.command;

/**
 * @ClassName: Command
 * @Description: 声明一个给出所有具体命令类的抽象接口
 * @date 2013-5-15 下午11:55:19
 * 
 * @author libratears
 * @version V1.0
 */
public interface Command {

	/**
	 * @Title: execute
	 * @Description: 执行的抽象
	 * 
	 */
	void execute();

	/**
	 * @Title: unexecute
	 * @Description: 取消的抽象
	 * 
	 */
	void unexecute();

}
