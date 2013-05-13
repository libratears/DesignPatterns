package com.libratears.pattern.structural.facade;

/**
 * @ClassName: Facade
 * @Description: 门面角色
 * @date 2013-5-14 上午12:38:50
 * 
 * @author libratears
 * @version V1.0
 */
public class Facade {

	private SubSystem1 s1 = new SubSystem1();

	private SubSystem2 s2 = new SubSystem2();

	/**
	 * @Title: OperationWrapper
	 * @Description: 把子系统中的动作打包
	 * 
	 */
	public void OperationWrapper() {
		s1.operation();
		s2.operation();
	}
}
