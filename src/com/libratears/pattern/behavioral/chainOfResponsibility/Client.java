package com.libratears.pattern.behavioral.chainOfResponsibility;

/**
 * @ClassName: Client 
 * @Description: 测试类 
 * @date 2013-5-15 下午11:35:13 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();
    }
}
