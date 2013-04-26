package com.libratears.pattern.creational.abstractFactory;

/**
 * @ClassName: AbstractFactory
 * @Description: 此类是抽象工厂方法模式的核心
 * @date 2013-4-26 上午1:04:18
 * 
 * @author tuyun
 * @version V1.0
 */
public interface AbstractFactory {

	/**
	 * @Title: createProductA
	 * @Description: 产生产品A
	 * 
	 * @return 产品A
	 */
	AbstractProductA createProductA();

	/**
	 * @Title: createProductB
	 * @Description: 产生产品B
	 * 
	 * @return 产品B
	 */
	AbstractProductB createProductB();

}
