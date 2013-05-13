package com.libratears.pattern.structural.flyweight;

/**
 * @ClassName: ConcreteFlyweight
 * @Description: 具体享元角色
 * @date 2013-5-14 上午12:44:47
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteFlyweight extends Flyweight {

	/**
	 * 类的内蕴
	 */
	private String _intrinsicState = "本来的东西";

	/**
	 * Creates a new instance of ConcreteFlyweight
	 */
	public ConcreteFlyweight() {
		System.out.println("ConcreteFlyweight init");
	}

	/**
	 * @see com.libratears.pattern.structural.flyweight.Flyweight#operation(java.lang.String)
	 */
	public void operation(String extrinsicState) {
		System.out.println("ConcreteFlyweight: 内蕴[" + _intrinsicState + "] 外蕴["
				+ extrinsicState + "]");
	}

}
