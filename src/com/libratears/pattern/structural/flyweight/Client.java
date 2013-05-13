package com.libratears.pattern.structural.flyweight;

/** 
 * @ClassName: Client 
 * @Description: 测试类 
 * @date 2013-5-14 上午12:48:18 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.getFlyweight("com.libratears.pattern.structual.flyweight.ConcreteFlyweight");
		fly.operation("first");
        fly.operation("second");
        Flyweight fly2 = factory.getFlyweight("com.libratears.pattern.structual.flyweight.ConcreteFlyweight");
        fly2.operation("third");
        fly2.operation("forth");
    }
}
