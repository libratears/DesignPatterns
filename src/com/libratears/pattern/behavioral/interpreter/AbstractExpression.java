package com.libratears.pattern.behavioral.interpreter;

/**
 * @ClassName: AbstractExpression
 * @Description: 抽象表达式角色
 * @date 2013-5-16 上午12:36:11
 * 
 * @author libratears
 * @version V1.0
 */
public interface AbstractExpression {

	/**
	 * @Title: interpret
	 * @Description: 解释操作
	 * 
	 * @param c
	 */
	void interpret(Context c);

}
