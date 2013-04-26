package com.libratears.pattern.creational.abstractFactory;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-4-26 上午1:23:57
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = new ConcreteFactory1();
		System.out.println(factory.createProductA().toString());
		System.out.println(factory.createProductB().toString());
		factory = new ConcreteFactory2();
		System.out.println(factory.createProductA().toString());
		System.out.println(factory.createProductB().toString());
	}
}
