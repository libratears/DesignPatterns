package com.libratears.pattern.structural.flyweight;

import java.util.HashMap;

/**
 * @ClassName: FlyweightFactory
 * @Description: 享元工厂角色，负责创建和管理享元角色
 * @date 2013-5-14 上午12:46:32
 * 
 * @author libratears
 * @version V1.0
 */
public class FlyweightFactory {

	/**
	 * 持有的享元对象
	 */
	private HashMap<String, Flyweight> _flies = new HashMap<String, Flyweight>();

	/**
	 * @Title: getFlyweight
	 * @Description: 得到享元对象，如果原先初始化就直接从_flies里面得到
	 * 
	 * @param createWhichClass
	 *            需要建立的对象的类名
	 * @return 享元对象
	 * @throws ClassNotFoundException
	 *             类没找到异常
	 * @throws IllegalAccessException
	 *             访问异常
	 * @throws InstantiationException
	 *             初始化异常
	 */
	public Flyweight getFlyweight(String createWhichClass)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		if (_flies.containsKey(createWhichClass)) {
			return (Flyweight) _flies.get(createWhichClass);
		} else {
			Flyweight fly = null;
			fly = (Flyweight) Class.forName(createWhichClass).newInstance();
			_flies.put(createWhichClass, fly);
			return fly;
		}
	}

}
