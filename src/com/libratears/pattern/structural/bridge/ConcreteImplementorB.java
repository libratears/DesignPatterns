package com.libratears.pattern.structural.bridge;

/**
 * @ClassName: ConcreteImplementorB
 * @Description: 具体实现B
 * @date 2013-4-27 上午12:03:26
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteImplementorB implements Implementor {

	/**
	 * @see com.libratears.pattern.structural.bridge.Implementor#operationImp(java.lang.String)
	 */
	public void operationImp(String inputText) {
		System.err.println("B:" + inputText);
	}

}
