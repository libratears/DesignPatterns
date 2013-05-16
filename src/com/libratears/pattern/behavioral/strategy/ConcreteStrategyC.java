package com.libratears.pattern.behavioral.strategy;

/** 
 * @ClassName: ConcreteStrategyC
 * @Description: 具体策略角色C，包装相关的算法和行为
 * @date 2013-5-17 上午12:07:41 
 * 
 * @author libratears
 * @version V1.0  
 */
public class ConcreteStrategyC implements Strategy {

    /**
     * @see com.libratears.pattern.behavioral.strategy.Strategy#algorithmInterface()
     */
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyC");
    }

}
