package com.libratears.pattern.structural.composite.safe;

/**
 * @ClassName: Component
 * @Description: 抽象构件角色，它给参加组合的对象定义出公共的接口及其默认行为，可以用来管理所有的子对象
 *               在安全式的合成模式里，这里不定义出管理子对象的方法，具体定义由树枝对象给出
 * @date 2013-5-13 下午11:51:38
 * 
 * @author libratears
 * @version V1.0
 */
public interface Component {

	/**
	 * 某种操作
	 */
	void operation();

	/**
	 * 返回自己的实例
	 * 
	 * @return 自己的实例
	 */
	Composite getComposite();

}
