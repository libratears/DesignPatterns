package com.libratears.pattern.structural.decorator;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-14 上午12:31:53
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Component comp = new ConcreteDecoratorA(new ConcreteDecoratorB(
				new ConcreteComponent()));
		comp.operation();
	}
}
