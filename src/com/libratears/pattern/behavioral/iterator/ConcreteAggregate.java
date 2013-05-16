package com.libratears.pattern.behavioral.iterator;

/**
 * @ClassName: ConcreteAggregate
 * @Description: 具体聚集角色
 * @date 2013-5-16 上午12:57:49
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteAggregate implements Aggregate {

	/**
	 * 持有的数组对象
	 */
	private Object[] _objs = { "kingfish", "niuniu", "99" };

	/**
	 * @see com.libratears.pattern.behavioral.iterator.Aggregate#createIterator()
	 */
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	/**
	 * 提供聚集元素
	 * 
	 * @param idx
	 *            位置
	 * @return 在位置上的对象
	 */
	public Object getElement(int idx) {
		if (idx < _objs.length)
			return _objs[idx];
		else
			return null;
	}

	/**
	 * @return 聚集的大小
	 */
	public int size() {
		return _objs.length;
	}

}
