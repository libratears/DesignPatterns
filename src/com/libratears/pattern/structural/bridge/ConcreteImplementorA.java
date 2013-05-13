package com.libratears.pattern.structural.bridge;

/**
 * @ClassName: ConcreteImplementorA
 * @Description: 具体实现A
 * @date 2013-4-27 上午12:02:42
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteImplementorA implements Implementor {

	/**
	 * @see com.libratears.pattern.structural.bridge.Implementor#operationImp(java.lang.String)
	 */
	public void operationImp(String inputText) {
		System.out.println("A:" + inputText);
	}

}
