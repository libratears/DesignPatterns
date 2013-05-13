package com.libratears.pattern.structural.bridge;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-4-27 上午12:06:27
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Implementor imp = new ConcreteImplementorA();
		Abstraction abs = new RefinedAbstraction(imp);
		abs.operation();
		
		Implementor imp2 = new ConcreteImplementorB();
		Abstraction abs2 = new RefinedAbstraction(imp2);
		abs2.operation();

	}
}
