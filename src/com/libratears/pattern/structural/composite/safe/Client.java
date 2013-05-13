package com.libratears.pattern.structural.composite.safe;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-13 下午11:49:14
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Component c = new Composite();
		c.getComposite().add(new Leaf());
		c.getComposite().add(new Leaf());

		Component c2 = new Composite();
		c2.getComposite().add(new Leaf());

		c.getComposite().add(c2);

		c.operation();
	}
}
