package com.libratears.pattern.structural.composite.transparence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: Composite
 * @Description: 树枝角色，代表参加组合的有下级子对象的对象。
 * @date 2013-5-14 上午12:08:31
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
	 * @see com.libratears.pattern.structural.composite.transparence.Component#operation()
	 */
	public void operation() {
		System.out.println("透明合成对象:operation");
		Iterator<Component> it = _componentList.iterator();
		while (it.hasNext()) {
			((Component) it.next()).operation();
		}
	}

	/**
	 * @see com.libratears.pattern.structural.composite.transparence.Component#add(com.libratears.pattern.structural.composite.transparence.Component)
	 */
	public void add(Component component) {
		_componentList.add(component);
	}

	/**
	 * @see com.libratears.pattern.structural.composite.transparence.Component#remove(com.libratears.pattern.structural.composite.transparence.Component)
	 */
	public void remove(Component component) {
		_componentList.remove(component);
	}

}
