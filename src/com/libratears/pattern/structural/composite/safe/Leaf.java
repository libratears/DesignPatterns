package com.libratears.pattern.structural.composite.safe;

/**
 * @ClassName: Leaf
 * @Description: 树叶类，此类没有下级对象，定义出参加组合的真正“某种操作”
 * @date 2013-5-13 下午11:59:01
 * 
 * @author libratears
 * @version V1.0
 */
public class Leaf implements Component {

	/**
	 * @see com.libratears.pattern.structural.composite.safe.Component#operation()
	 */
	public void operation() {
		System.out.println("安全树叶对象:operation");
	}

	/**
	 * @see com.libratears.pattern.structural.composite.safe.Component#getComposite()
	 */
	public Composite getComposite() {
		return null;
	}

}
