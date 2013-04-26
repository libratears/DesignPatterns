package com.libratears.pattern.creational.abstractFactory;

/**
 * @ClassName: ConcreteFactory2
 * @Description: 本角色直接在客户端的调用下创建产品的实例，这个角色含有选择合适的产品对象的逻辑，而这个逻辑适于应用系统的商业逻辑紧密相关的。
 * @date 2013-4-26 上午1:19:45
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteFactory2 implements AbstractFactory {

	/**
	 * 创建A产品
	 * 
	 * @see com.libratears.pattern.creational.abstractFactory.AbstractFactory#createProductA()
	 */
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	/**
	 * 创建B产品
	 * 
	 * @see com.libratears.pattern.creational.abstractFactory.AbstractFactory#createProductB()
	 */
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
