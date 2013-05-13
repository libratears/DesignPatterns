package com.libratears.pattern.structural.composite.safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: Composite
 * @Description: 树枝角色，代表参加组合的有下级子对象的对象。这里给出所有管理子对象的方法
 * @date 2013-5-13 下午11:54:03
 * 
 * @author libratears
 * @version V1.0
 */
public class Composite implements Component {

	/**
	 * 包含子对象的容器
	 */
	private List<Component> _componentList = new ArrayList<Component>();

	/**
	 * @see com.libratears.pattern.structural.composite.safe.Component#operation()
	 */
	public void operation() {
		System.out.println("安全合成对象:operation");
		Iterator<Component> it = _componentList.iterator();
		while (it.hasNext()) {
			((Component) it.next()).operation();
		}
	}

	/**
	 * @see com.libratears.pattern.structural.composite.safe.Component#getComposite()
	 */
	public Composite getComposite() {
		return this;
	}

	/**
	 * @Title: add
	 * @Description: 增加一个子对象
	 * 
	 * @param component
	 */
	public void add(Component component) {
		_componentList.add(component);
	}

	/**
	 * @Title: remove
	 * @Description: 删除一个子对象
	 * 
	 * @param component
	 */
	public void remove(Component component) {
		_componentList.remove(component);
	}

}
