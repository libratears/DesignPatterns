package com.libratears.pattern.creational.prototype;

/**
 * @ClassName: ConcretePrototype1 具体的原始模型类1
 * @date 2013-4-26 下午9:46:00
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcretePrototype1 implements Cloneable {

	private String _type;

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		this._type = type;
	}

	/**
	 * 克隆方法
	 * 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {
		ConcretePrototype1 temp = new ConcretePrototype1();
		temp.setType(_type);
		return (Object) temp;
	}
}
