package com.libratears.pattern.creational.singleton;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-4-26 下午9:26:05
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LazySingleton s1 = LazySingleton.getInstance();
		line();
		EagerSingleton s2 = EagerSingleton.getInstance();
		line();
		RegSingleton s3 = RegSingleton.getInstance(null);
		line();
		RegSingletonChild s4 = RegSingletonChild.getInstance();
		line();
		RegSingletonChild s5 = RegSingletonChild.getInstance();
		line();
	}

	/**
	 * 画条线
	 */
	private static void line() {
		System.out.println("-------------------");
	}
}
