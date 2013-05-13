package com.libratears.pattern.structural.decorator;

/**
 * @ClassName: Decorator
 * @Description: 装饰者
 * @date 2013-5-14 上午12:27:12
 * 
 * @author libratears
 * @version V1.0
 */
public abstract class Decorator implements Component {

	/**
	 * 一个存放的容器
	 */
	private Component myComp;

	/**
	 * @param myC
	 *            被装入的Component对象
	 */
	public Decorator(Component myC) {
		myComp = myC;
	}

	/**
	 * @see com.libratears.pattern.structural.decorator.Component#operation()
	 */
	public void operation() {
		if (myComp != null)
			myComp.operation();
	}

}
