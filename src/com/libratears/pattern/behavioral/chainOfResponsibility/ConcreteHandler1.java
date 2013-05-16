package com.libratears.pattern.behavioral.chainOfResponsibility;

/**
 * @ClassName: ConcreteHandler1
 * @Description: 具体处理者1
 * @date 2013-5-15 下午11:34:00
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteHandler1 extends Handler {

	/**
	 * @see com.libratears.pattern.behavioral.chainOfResponsibility.Handler#handleRequest()
	 */
	public void handleRequest() {
		if (getSuccessor() != null) {
			System.out.println("ConcreteHandler1的下家是:" + getSuccessor());
			getSuccessor().handleRequest();
		} else {
			System.out.println("ConcreteHandler1结束了");
		}
	}

	public String toString() {
		return "ConcreteHandler1";
	}

}
