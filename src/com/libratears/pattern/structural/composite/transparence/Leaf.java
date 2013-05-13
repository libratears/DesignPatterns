package com.libratears.pattern.structural.composite.transparence;

/**
 * @ClassName: Leaf
 * @Description: 树叶对象，此类没有下级对象，定义出参加组合的真正“某种操作”
 * @date 2013-5-14 上午12:11:02
 * 
 * @author libratears
 * @version V1.0
 */
public class Leaf implements Component {

	/**
	 * @see com.libratears.pattern.structural.composite.transparence.Component#operation()
	 */
	public void operation() {
		System.out.println("透明树叶对象:operation");
	}

	/**
	 * @see com.libratears.pattern.structural.composite.transparence.Component#add(com.libratears.pattern.structural.composite.transparence.Component)
	 */
	public void add(Component component) {
	}

	/**
	 * @see com.libratears.pattern.structural.composite.transparence.Component#remove(com.libratears.pattern.structural.composite.transparence.Component)
	 */
	public void remove(Component component) {
	}

}
