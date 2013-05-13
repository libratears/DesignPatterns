package com.libratears.pattern.structural.flyweight;

/**
 * @ClassName: Flyweight
 * @Description: 抽象享元角色，规定具体享元角色的接口
 * @date 2013-5-14 上午12:43:41
 * 
 * @author libratears
 * @version V1.0
 */
public abstract class Flyweight {

	/**
	 * @Title: operation
	 * @Description: 测试方法
	 *
	 * @param extrinsicState
	 */
	abstract public void operation(String extrinsicState);
}
