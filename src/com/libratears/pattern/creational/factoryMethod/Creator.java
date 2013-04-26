package com.libratears.pattern.creational.factoryMethod;

/**
 * @ClassName: Creator
 * @Description: 抽象工厂，任何在模式中创建的工厂类必须实现这个接口
 * @date 2013-4-26 上午1:35:27
 * 
 * @author libratears
 * @version V1.0
 */
public interface Creator {
	/**
	 * @Title: FactoryMethod
	 * @Description: 工厂方法
	 *
	 * @return 抽象产品
	 */
	Product factoryMethod();
}
