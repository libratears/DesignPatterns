package com.libratears.pattern.structural.decorator;

/**
 * @ClassName: ConcreteComponent
 * @Description: 实现具体功能的主类
 * @date 2013-5-14 上午12:30:20
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteComponent implements Component {

	/**
	 * @see com.libratears.pattern.structural.decorator.Component#operation()
	 */
	public void operation() {
		System.out.println("ConcreteComponent");
	}

}
