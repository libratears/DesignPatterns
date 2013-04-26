package com.libratears.pattern.creational.prototype;

/**
 * @ClassName: ConcretePrototype2
 * @Description: 具体的原始模型类2
 * @date 2013-4-26 下午9:47:29
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcretePrototype2 implements Cloneable {

	private String _name;

	public String getName() {
		return _name;
	}

	public void setName(String type) {
		this._name = type;
	}

	/**
	 * 克隆方法
	 * 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {
		ConcretePrototype2 temp = new ConcretePrototype2();
		temp.setName(_name);
		return (Object) temp;
	}
}
