package com.libratears.pattern.structural.facade;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-14 上午12:39:36
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Facade f = new Facade();
		f.OperationWrapper();
	}
}
