package com.libratears.pattern.creational.singleton;

/**
 * @ClassName: EagerSingleton
 * @Description: 饿汉式单例
 * @date 2013-4-26 下午10:46:27
 * 
 * @author libratears
 * @version V1.0
 */
public class EagerSingleton {

	/**
	 * 私有的(private)唯一(static final)实例成员,在类加载的时候就创建好了单例对象
	 */
	private static final EagerSingleton _uniqueInstance = new EagerSingleton();

	/**
	 * 私有构造方法,避免外部创建实例
	 */
	private EagerSingleton() {
		System.out.println("EagerSingleton initialized");
	}

	/**
	 * @Title: getInstance
	 * @Description: 静态工厂方法,返回此类的唯一实例.
	 * 
	 * @return
	 */
	synchronized public static EagerSingleton getInstance() {
		return _uniqueInstance;
	}
}
