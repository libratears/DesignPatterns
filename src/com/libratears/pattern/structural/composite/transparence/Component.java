package com.libratears.pattern.structural.composite.transparence;

/**
 * @ClassName: Component
 * @Description: 抽象构件角色，它给参加组合的类定义出公共的接口及其默认行为，这里包括管理所有的子对象的接口定义。
 * @date 2013-5-14 上午12:04:22
 * 
 * @author libratears
 * @version V1.0
 */
public interface Component {

	/**
	 * @Title: operation
	 * @Description: 某种操作
	 * 
	 */
	void operation();

	/**
	 * @Title: add
	 * @Description: 增加一个子对象
	 * 
	 * @param component
	 */
	void add(Component component);

	/**
	 * @Title: remove
	 * @Description: 删除一个子对象
	 * 
	 * @param component
	 */
	void remove(Component component);
}
