package com.libratears.pattern.structural.bridge;

/**
 * @ClassName: Abstraction
 * @Description: 对抽象做出定义，并定义实现的引用
 * @date 2013-4-27 上午12:04:36
 * 
 * @author libratears
 * @version V1.0
 */
public abstract class Abstraction {

	/**
	 * 实现
	 */
	private Implementor _imp = null;

	/**
	 * 与实现挂钩
	 * 
	 * @param imp
	 */
	public Abstraction(Implementor imp) {
		this._imp = imp;
	}

	protected void print(String str) {
		_imp.operationImp(str);
	}

	/**
	 * 操作
	 */
	public abstract void operation();
}
