package com.libratears.pattern.behavioral.interpreter;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-16 上午12:40:36
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Context c = new Context();
		AbstractExpression ae = new NonterminalExpression(
				new TerminalExpression("hello my friend!"), 2);
		ae.interpret(c);
	}
}
