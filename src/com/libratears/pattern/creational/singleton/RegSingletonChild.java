package com.libratears.pattern.creational.singleton;

/**
 * @ClassName: RegSingletonChild
 * @Description: 可继承单例的子类
 * @date 2013-4-26 下午9:22:54
 * 
 * @author libratears
 * @version V1.0
 */
public class RegSingletonChild extends RegSingleton {

	public RegSingletonChild() {
		System.out.println("RegSingletonChild initialized");
	}

	/**
	 * 静态工厂方法，返回此类的唯一实例
	 * 
	 * @return 自己
	 */
	static public RegSingletonChild getInstance() {
		return (RegSingletonChild) RegSingleton
				.getInstance("com.libratears.pattern.creational.singleton.RegSingletonChild");
	}

}
