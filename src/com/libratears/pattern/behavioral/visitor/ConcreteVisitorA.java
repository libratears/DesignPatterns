package com.libratears.pattern.behavioral.visitor;

/**
 * @ClassName: ConcreteVisitorA
 * @Description: 具体访问者A角色
 * @date 2013-5-17 上午12:31:44
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteVisitorA implements Visitor {

	/**
	 * @see com.libratears.pattern.behavioral.visitor.Visitor#visit(com.libratears.pattern.behavioral.visitor.ConcreteElementA)
	 */
	public void visit(ConcreteElementA cea) {
		System.out.println("ConcreteVisitorA: " + cea.operationA());
	}

	/**
	 * @see com.libratears.pattern.behavioral.visitor.Visitor#visit(com.libratears.pattern.behavioral.visitor.ConcreteElementB)
	 */
	public void visit(ConcreteElementB ceb) {
		System.out.println("ConcreteVisitorA: " + ceb.operationB());
	}

}
