package com.libratears.pattern.structural.bridge;

/**
 * @ClassName: RefinedAbstraction
 * @Description: 扩展抽象类，改变和修正父类对象的定义
 * @date 2013-4-27 上午12:05:47
 * 
 * @author libratears
 * @version V1.0
 */
public class RefinedAbstraction extends Abstraction {

	/**
	 * @param imp
	 */
	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}

	/**
	 * @see com.libratears.pattern.structural.bridge.Abstraction#operation()
	 */
	public void operation() {
		super.print("RefinedAbstraction");
	}

}
