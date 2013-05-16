package com.libratears.pattern.behavioral.visitor;

/** 
 * @ClassName: Element 
 * @Description: 抽象元素角色
 * @date 2013-5-17 上午12:29:01 
 * 
 * @author libratears
 * @version V1.0  
 */
public interface Element {
    
    /**
     * 接受访问者的方法
     * @param visitor 访问者
     */
    void accept(Visitor visitor);

}
