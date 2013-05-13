package com.libratears.pattern.structural.adapter.forClass;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-4-26 下午11:46:06
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Target t = new Adapter();
		t.request();
	}
}
