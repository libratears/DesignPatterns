package com.libratears.pattern.creational.builder;

/** 
 * @ClassName: ConcreteBuilder 
 * @Description: 具体建造者，与应用程序紧密相关的一些类
 * @date 2013-4-26 下午10:00:21 
 * 
 * @author libratears
 * @version V1.0  
 */
public class ConcreteBuilder implements Builder {

	private Product _product = new Product1();

	/**
	 * @see com.libratears.pattern.creational.builder.Builder#buildPart1()
	 */
	public void buildPart1() {
		_product.setPart1("A");
	}

	/**
	 * @see com.libratears.pattern.creational.builder.Builder#buildPart2()
	 */
	public void buildPart2() {
		_product.setPart2("B");
	}

	/**
	 * @see com.libratears.pattern.creational.builder.Builder#getResult()
	 */
	public Product getResult() {
		return _product;
	}

}
