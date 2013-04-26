package com.libratears.pattern.creational.factoryMethod;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-4-26 上午1:33:16
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.factoryMethod();
		System.out.println(product.toString());
	}
}
