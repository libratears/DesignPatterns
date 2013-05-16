package com.libratears.pattern.behavioral.interpreter;

/**
 * @ClassName: NonterminalExpression
 * @Description: 非终结表达式角色，此处为循环语句
 * @date 2013-5-16 上午12:38:55
 * 
 * @author libratears
 * @version V1.0
 */
public class NonterminalExpression implements AbstractExpression {

	/**
	 * 持有的表达式
	 */
	private AbstractExpression _expression;

	/**
	 * 循环的次数
	 */
	private int _times = 0;

	/**
	 * 初始化持有对象，并明确循环次数
	 * 
	 * @param exp
	 *            表达式对象
	 * @param times
	 *            循环的次数
	 */
	public NonterminalExpression(AbstractExpression exp, int times) {
		_expression = exp;
		_times = times;
	}

	/**
	 * @see com.libratears.pattern.behavioral.interpreter.AbstractExpression#interpret(com.libratears.pattern.behavioral.interpreter.Context)
	 */
	public void interpret(Context c) {
		for (int i = 0; i < _times; i++) {
			_expression.interpret(c);
		}
	}

}
