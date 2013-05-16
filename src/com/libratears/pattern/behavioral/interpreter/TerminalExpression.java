package com.libratears.pattern.behavioral.interpreter;

/**
 * @ClassName: TerminalExpression
 * @Description: 终结表达式，此处为一般语句
 * @date 2013-5-16 上午12:39:52
 * 
 * @author libratears
 * @version V1.0
 */
public class TerminalExpression implements AbstractExpression {

	/**
	 * 持有的语句
	 */
	private String _statement;

	/**
	 * 初始化持有对象
	 * 
	 * @param stat
	 *            语句的字符串
	 */
	public TerminalExpression(String stat) {
		_statement = stat;
	}

	/**
	 * @see com.libratears.pattern.behavioral.interpreter.AbstractExpression#interpret(com.libratears.pattern.behavioral.interpreter.Context)
	 */
	public void interpret(Context c) {
		System.out.println(_statement);
	}

}
