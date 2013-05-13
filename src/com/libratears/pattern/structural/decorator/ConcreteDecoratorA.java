package com.libratears.pattern.structural.decorator;

/** 
 * @ClassName: ConcreteDecoratorA 
 * @Description: 在ConcreteComponent类之前扩展功能的类A
 * @date 2013-5-14 上午12:28:44 
 * 
 * @author libratears
 * @version V1.0  
 */
public class ConcreteDecoratorA extends Decorator {

    /**
     * @param myC 被装入的Component对象
     */
    public ConcreteDecoratorA(Component myC) {
        super(myC);
    }

    /**
     * @see com.libratears.pattern.structural.decorator.Decorator#operation()
     */
    public void operation(){
        System.out.println("ConcreteDecoratorA");
        super.operation();
    }

}
