package com.libratears.pattern.behavioral.strategy;

/** 
 * @ClassName: ConcreteStrategyA 
 * @Description: 具体策略角色A，包装相关的算法和行为
 * @date 2013-5-17 上午12:07:41 
 * 
 * @author libratears
 * @version V1.0  
 */
public class ConcreteStrategyA implements Strategy {

    /**
     * @see com.libratears.pattern.behavioral.strategy.Strategy#algorithmInterface()
     */
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyA");
    }

}
