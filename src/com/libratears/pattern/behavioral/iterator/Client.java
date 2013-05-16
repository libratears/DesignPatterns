package com.libratears.pattern.behavioral.iterator;

/**
 * @ClassName: Client
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2013-5-16 上午12:59:45
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Aggregate agg = new ConcreteAggregate();
		Iterator it = agg.createIterator();
		while (!it.hasNext()) {
			System.out.println(it.currentItem());
			it.next();
		}
	}
}
