package com.libratears.pattern.creational.builder;

/** 
 * @ClassName: Director 
 * @Description: 导演，负责有规则的构建对象与Client类合并时需要把建造的细节放到ConcreteBuilder中去
 * @date 2013-4-26 下午10:02:15 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Director {
    
    private Builder _builder;
    
    public Director(Builder builder) {
    	this._builder = builder;
    }
    
    /**
     * @Title: construct
     * @Description: 产品构造方法，负责调用各个零件建造方法
     *
     */
    public void construct(){
        _builder.buildPart1();
        _builder.buildPart2();
    }
    
}
