package com.libratears.pattern.creational.builder;

/** 
 * @ClassName: Client 
 * @Description: 测试类
 * @date 2013-4-26 下午10:03:06 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Client {

    public static void main(String[] args) {
    	ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construct(); 
        Product product = builder.getResult();
        System.out.println(product.toString());
    }
}
