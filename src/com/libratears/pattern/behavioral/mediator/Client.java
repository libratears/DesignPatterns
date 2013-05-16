package com.libratears.pattern.behavioral.mediator;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-16 上午1:10:00
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		ConcreteMediator med = new ConcreteMediator();
		ConcreteColleague1 c1 = new ConcreteColleague1(med);
		ConcreteColleague2 c2 = new ConcreteColleague2(med);
		med.introColleagues(c1, c2);
		med.doSomething();
		c1.setHelloWords("good job!");
		c1.change();
		System.out.println("===================");
	}

}
