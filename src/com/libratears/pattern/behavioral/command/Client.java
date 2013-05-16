package com.libratears.pattern.behavioral.command;

/**
 * @ClassName: Client 
 * @Description: 测试类
 * @date 2013-5-16 上午12:00:05 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
