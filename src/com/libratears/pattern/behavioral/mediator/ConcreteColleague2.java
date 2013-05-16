package com.libratears.pattern.behavioral.mediator;

/**
 * @ClassName: ConcreteColleague2
 * @Description: 具体的同事类2
 * @date 2013-5-16 上午1:12:46
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteColleague2 extends Colleague {

	/**
	 * @param med
	 *            调停者
	 */
	public ConcreteColleague2(Mediator med) {
		super(med);
	}

	/**
	 * @see com.libratears.pattern.behavioral.mediator.Colleague#action()
	 */
	public void action() {
		System.out.println("hello from Colleague2");
	}

}
