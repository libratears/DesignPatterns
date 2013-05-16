package com.libratears.pattern.behavioral.strategy;

/** 
 * @ClassName: Client 
 * @Description: 测试类
 * @date 2013-5-17 上午12:10:00 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Client {

    public static void main(String[] args) {
        ConcreteStrategyC csc = new ConcreteStrategyC();
        Context c = new Context(csc);
        c.contextInterface();
        c.setStrategy(new ConcreteStrategyB());
        c.contextInterface();
        c.setStrategy(new ConcreteStrategyA());
        c.contextInterface();
    }
}
