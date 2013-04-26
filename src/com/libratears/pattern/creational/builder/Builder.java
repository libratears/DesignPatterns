package com.libratears.pattern.creational.builder;

/** 
 * @ClassName: Builder 
 * @Description: 抽象建造者，规范产品对象的各个组成成分的建造。一般而言，此接口独立于应用程序的商业逻辑。
 * @date 2013-4-26 下午9:55:22 
 * 
 * @author libratears
 * @version V1.0  
 */
public interface Builder {
    
    void buildPart1();
    
    void buildPart2();
    
    Product getResult();
    
}
