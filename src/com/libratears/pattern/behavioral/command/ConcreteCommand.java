package com.libratears.pattern.behavioral.command;

/**
 * @ClassName: ConcreteCommand
 * @Description: 具体命令角色，定义一个接收者和行为之间的弱耦合，实现execute方法，负责调用接收者的相应操作
 * @date 2013-5-15 下午11:59:13
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteCommand implements Command {

	/**
	 * 持有的接收者对象
	 */
	private Receiver _receiver;

	/**
	 * 初始化持有的接收者对象
	 * 
	 * @param receiver
	 *            接收者对象
	 */
	public ConcreteCommand(Receiver receiver) {
		_receiver = receiver;
	}

	/**
	 * @see com.libratears.pattern.behavioral.command.Command#execute()
	 */
	public void execute() {
		_receiver.action();
	}

	/**
	 * @see com.libratears.pattern.behavioral.command.Command#unexecute()
	 */
	public void unexecute() {
	}

}
