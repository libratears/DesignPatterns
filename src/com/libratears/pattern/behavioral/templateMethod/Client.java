package com.libratears.pattern.behavioral.templateMethod;

/** 
 * @ClassName: Client 
 * @Description: 测试类
 * @date 2013-5-15 下午11:52:39 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass ac = new ConcreteClass();
        ac.templateMethod();
    }
}
