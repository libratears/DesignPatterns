package com.libratears.pattern.behavioral.iterator;

/**
 * @ClassName: ConcreteIterator
 * @Description: 具体迭代子角色
 * @date 2013-5-16 上午12:55:55
 * 
 * @author libratears
 * @version V1.0
 */
public class ConcreteIterator implements Iterator {

	/**
	 * 持有的具体聚集对象
	 */
	private ConcreteAggregate _cagg;

	/**
	 * 聚集索引
	 */
	private int _index = 0;

	/**
	 * 初始化具体聚集对象
	 * 
	 * @param cagg
	 *            具体聚集对象
	 */
	public ConcreteIterator(ConcreteAggregate cagg) {
		_cagg = cagg;
	}

	/**
	 * @see com.libratears.pattern.behavioral.iterator.Iterator#first()
	 */
	public void first() {
		_index = 0;
	}

	/**
	 * @see com.libratears.pattern.behavioral.iterator.Iterator#next()
	 */
	public void next() {
		if (_index < _cagg.size())
			_index++;
	}

	/**
	 * @see com.libratears.pattern.behavioral.iterator.Iterator#hasNext()
	 */
	public boolean hasNext() {
		return (_index >= _cagg.size());
	}

	/**
	 * @see com.libratears.pattern.behavioral.iterator.Iterator#currentItem()
	 */
	public Object currentItem() {
		return _cagg.getElement(_index);
	}

}
