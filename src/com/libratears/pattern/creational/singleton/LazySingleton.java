package com.libratears.pattern.creational.singleton;


/** 
 * @ClassName: LazySingleton 
 * @Description: 懒汉式单例
 * @date 2013-4-26 下午10:46:27 
 * 
 * @author libratears
 * @version V1.0  
 */
public class LazySingleton {

	/**
     * 私有静态对象,加载时候不做初始化
     */
	private static LazySingleton _uniqueInstance = null;

	/**
     * 私有构造方法,避免外部创建实例
     */
	private LazySingleton() {
		System.out.println("LazySingleton initialized");
	}

	/**
	 * @Title: getInstance
	 * @Description: 静态工厂方法，返回此类的唯一实例，当发现实例没有初始化的时候,才初始化.
	 * 
	 * @return
	 */
	synchronized public static LazySingleton getInstance() {
		if (_uniqueInstance == null) {
			_uniqueInstance = new LazySingleton();
		}
		return _uniqueInstance;
	}
}
