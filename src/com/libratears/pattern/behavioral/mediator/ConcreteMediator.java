package com.libratears.pattern.behavioral.mediator;

/**
 * @ClassName: ConcreteMediator
 * @Description: 具体的调停者
 * @date 2013-5-16 上午1:14:11
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteMediator implements Mediator {

	/**
	 * 持有的同事1
	 */
	private ConcreteColleague1 _col1;

	/**
	 * 持有的同事2
	 */
	private ConcreteColleague2 _col2;

	/**
	 * 初始化持有的对象
	 * 
	 * @param c1
	 *            同事1
	 * @param c2
	 *            同事2
	 */
	public void introColleagues(ConcreteColleague1 c1, ConcreteColleague2 c2) {
		this._col1 = c1;
		this._col2 = c2;
	}

	public ConcreteColleague1 getConcreteColleague1() {
		return _col1;
	}

	public void setConcreteColleague1(ConcreteColleague1 _col1) {
		this._col1 = _col1;
	}

	public ConcreteColleague2 getConcreteColleague2() {
		return _col2;
	}

	public void setConcreteColleague2(ConcreteColleague2 _col2) {
		this._col2 = _col2;
	}
	
	/**
	 * @see com.libratears.pattern.behavioral.mediator.Mediator#doSomething()
	 */
	public void doSomething() {
		_col1.action();
		_col2.action();
	}

}
