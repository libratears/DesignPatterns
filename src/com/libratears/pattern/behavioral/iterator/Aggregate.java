package com.libratears.pattern.behavioral.iterator;

/**
 * @ClassName: Aggregate
 * @Description: 聚集角色
 * @date 2013-5-16 上午12:58:23
 * 
 * @author libratears
 * @version V1.0
 */
public interface Aggregate {

	/**
	 * 工厂方法，创建迭代子的接口
	 * 
	 * @return 迭代子
	 */
	Iterator createIterator();

}
