package com.libratears.pattern.behavioral.visitor;

/**
 * @ClassName: ConcreteElementA
 * @Description: 具体元素A
 * @date 2013-5-17 上午12:29:46
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteElementA implements Element {

	/**
	 * @see com.libratears.pattern.behavioral.visitor.Element#accept(com.libratears.pattern.behavioral.visitor.Visitor)
	 */
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	/**
	 * 特有的方法
	 * 
	 * @return 一字符串
	 */
	public String operationA() {
		return "operation from A";
	}

}
