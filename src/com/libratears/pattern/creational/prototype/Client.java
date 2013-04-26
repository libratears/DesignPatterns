package com.libratears.pattern.creational.prototype;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-4-26 下午9:48:10
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		ConcretePrototype1 cp1a = new ConcretePrototype1();
		cp1a.setType("fish");
		ConcretePrototype1 cp1b = (ConcretePrototype1) cp1a.clone();
		System.out.println(cp1b.getType());

		ConcretePrototype2 cp2a = new ConcretePrototype2();
		cp2a.setName("kingfish");
		ConcretePrototype2 cp2b = (ConcretePrototype2) cp2a.clone();
		System.out.println(cp2b.getName());
	}
}
