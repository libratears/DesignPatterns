package com.libratears.pattern.behavioral.mediator;

/**
 * @ClassName: ConcreteColleague1
 * @Description: 具体的同事类1
 * @date 2013-5-16 上午1:15:43
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteColleague1 extends Colleague {

	private String _helloWords = "happy new year!";

	/**
	 * @param med
	 *            调停者
	 */
	public ConcreteColleague1(Mediator med) {
		super(med);
	}

	/**
	 * @see com.libratears.pattern.behavioral.mediator.Colleague#action()
	 */
	public void action() {
		System.out.println(_helloWords + " from Colleague1");
	}

	public void setHelloWords(String helloWords) {
		this._helloWords = helloWords;
	}
}
