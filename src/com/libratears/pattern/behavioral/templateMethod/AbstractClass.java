package com.libratears.pattern.behavioral.templateMethod;

/** 
 * @ClassName: AbstractClass 
 * @Description: 抽象模版角色
 * @date 2013-5-15 下午11:50:36 
 * 
 * @author libratears
 * @version V1.0  
 */
public abstract class AbstractClass {
    
	/**
	 * @Title: templateMethod
	 * @Description: 模版方法，给出逻辑的骨架
	 * 
	 */
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }

    /**
     * 基本操作1，子类须实现
     */
    protected abstract void primitiveOperation1();

    /**
     * 基本操作2，子类须实现
     */
    protected abstract void primitiveOperation2();

}
