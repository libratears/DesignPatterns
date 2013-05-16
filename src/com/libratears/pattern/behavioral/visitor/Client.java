package com.libratears.pattern.behavioral.visitor;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-17 上午12:33:26
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		os.add(new ConcreteElementA());
		os.add(new ConcreteElementB());

		Visitor visitor = new ConcreteVisitorA();
		os.action(visitor); // 访问者访问所有的元素
		visitor = new ConcreteVisitorB();
		os.action(visitor);
	}
}
