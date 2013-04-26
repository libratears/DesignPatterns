package com.libratears.pattern.creational.factoryMethod;

/** 
 * @ClassName: ConcreteCreator 
 * @Description: 具体工厂，此类中包含于应用密切相关的逻辑，并且受到应用程序的调用以创建产品对象。
 * @date 2013-4-26 上午1:38:25 
 * 
 * @author libratears
 * @version V1.0  
 */
public class ConcreteCreator implements Creator {

    /**
     * @see com.libratears.pattern.creational.factoryMethod.Creator#FactoryMethod()
     */
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

}
