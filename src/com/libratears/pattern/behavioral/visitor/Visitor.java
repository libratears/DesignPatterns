package com.libratears.pattern.behavioral.visitor;

/**
 * @ClassName: Visitor
 * @Description: 抽象访问者角色，声明一个或多个访问操作
 * @date 2013-5-17 上午12:28:18
 * 
 * @author libratears
 * @version V1.0
 */
public interface Visitor {
    
    /**
     * 对于ConcreteElementA的访问操作
     * @param cea 具体元素
     */
    void visit(ConcreteElementA cea);

    /**
     * 对于ConcreteElementB的访问操作
     * @param ceb 具体元素
     */
    void visit(ConcreteElementB ceb);

}
