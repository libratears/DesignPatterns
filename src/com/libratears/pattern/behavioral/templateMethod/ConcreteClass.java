package com.libratears.pattern.behavioral.templateMethod;

/**
 * @ClassName: ConcreteClass
 * @Description: 具体模版角色
 * @date 2013-5-15 下午11:51:56
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteClass extends AbstractClass {

	/**
	 * @see com.libratears.pattern.behavioral.templateMethod.AbstractClass#primitiveOperation1()
	 */
	protected void primitiveOperation1() {
		System.out.println("primitiveOperation1");
	}

	/**
	 * @see com.libratears.pattern.behavioral.templateMethod.AbstractClass#primitiveOperation2()
	 */
	protected void primitiveOperation2() {
		System.out.println("primitiveOperation2");
	}

}
