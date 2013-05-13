package com.libratears.pattern.structural.decorator;

/** 
 * @ClassName: ConcreteDecoratorB
 * @Description: 在ConcreteComponent类之前扩展功能的类B
 * @date 2013-5-14 上午12:28:44 
 * 
 * @author libratears
 * @version V1.0  
 */
public class ConcreteDecoratorB extends Decorator {

    /**
     * @param myC 被装入的Component对象
     */
    public ConcreteDecoratorB(Component myC) {
        super(myC);
    }

    /**
     * @see com.libratears.pattern.structural.decorator.Decorator#operation()
     */
    public void operation(){
        System.out.println("ConcreteDecoratorB");
        super.operation();
    }

}
