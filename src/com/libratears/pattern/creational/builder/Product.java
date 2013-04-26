package com.libratears.pattern.creational.builder;

/** 
 * @ClassName: Product 
 * @Description: 抽象产品
 * @date 2013-4-26 下午9:56:40 
 * 
 * @author libratears
 * @version V1.0  
 */
public interface Product {
    
    public String getPart1();

    public void setPart1(String part1);

    public String getPart2();

    public void setPart2(String part2);
}