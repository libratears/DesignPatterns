package com.libratears.pattern.structural.composite.transparence;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-14 上午12:11:59
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Component c = new Composite();
		Component l1 = new Leaf();
		l1.add(new Leaf());// 此句话没有任何意义
		c.add(l1);
		c.add(new Leaf());

		Component c2 = new Composite();
		c2.add(new Leaf());

		c.add(c2);

		c.operation();
	}
}
