package com.libratears.pattern.behavioral.state;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-5-17 上午12:01:24
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

    public static void main(String[] args) {
        Context c = new Context();
        c.setState(new ConcreteStateA()); 
        c.request();
        c.setState(new ConcreteStateB()); 
        c.request();
    }
}
