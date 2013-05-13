package com.libratears.pattern.structural.proxy;

/**
 * @ClassName: RealSubject
 * @Description: 真正干活的类
 * @date 2013-5-14 上午12:58:56
 * 
 * @author libratears
 * @version V1.0
 */
public class RealSubject implements Subject {

	/**
	 * 做这
	 */
	private void doThis() {
		System.out.print("烧饼的价格：");
	}

	/**
	 * 做那，反正干了不少事情
	 * 
	 * @return 成本
	 */
	private int doThat() {
		return 2;
	}

	/**
	 * @see com.libratears.pattern.structural.proxy.Subject#request()
	 */
	public int request() {
		doThis();
		return doThat();
	}

}
