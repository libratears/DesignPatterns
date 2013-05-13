package com.libratears.pattern.structural.bridge;

/**
 * @ClassName: Implementor
 * @Description: 给出实现的接口，主要负责底层操作
 * @date 2013-4-27 上午12:01:51
 * 
 * @author libratears
 * @version V1.0
 */
public interface Implementor {

	/**
	 * 操作实现方法
	 * 
	 * @param inputText
	 */
	void operationImp(String inputText);

}
