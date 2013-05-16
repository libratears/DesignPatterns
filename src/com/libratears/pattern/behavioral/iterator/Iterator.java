package com.libratears.pattern.behavioral.iterator;

/**
 * @ClassName: Iterator
 * @Description: 抽象迭代子角色，定义出遍历元素所需要的接口
 * @date 2013-5-16 上午12:53:26
 * 
 * @author libratears
 * @version V1.0
 */
public interface Iterator {

	/**
	 * @Title: first
	 * @Description: 移动到第一个元素
	 *
	 */
	void first();

	/**
	 * @Title: next
	 * @Description: 移动到下一个元素
	 *
	 */
	void next();

	/**
	 * @Title: hasNext
	 * @Description: 是否是最后一个元素
	 *
	 * @return
	 */
	boolean hasNext();

	/**
	 * @Title: currentItem
	 * @Description: 当前元素
	 *
	 * @return
	 */
	Object currentItem();

}
