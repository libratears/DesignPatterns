package com.libratears.pattern.behavioral.visitor;

/**
 * @ClassName: ConcreteVisitorB
 * @Description: 具体访问者B角色
 * @date 2013-5-17 上午12:31:44
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteVisitorB implements Visitor {

	/**
	 * @see com.libratears.pattern.behavioral.visitor.Visitor#visit(com.libratears.pattern.behavioral.visitor.ConcreteElementA)
	 */
	public void visit(ConcreteElementA cea) {
		System.out.println("ConcreteVisitorB: " + cea.operationA());
	}

	/**
	 * @see com.libratears.pattern.behavioral.visitor.Visitor#visit(com.libratears.pattern.behavioral.visitor.ConcreteElementB)
	 */
	public void visit(ConcreteElementB ceb) {
		System.out.println("ConcreteVisitorB: " + ceb.operationB());
	}

}
