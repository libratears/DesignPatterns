package com.libratears.pattern.creational.singleton;

import java.util.HashMap;

/**
 * @ClassName: RegSingleton
 * @Description: 登记式单例，不保证线程安全
 * @date 2013-4-26 下午9:05:31
 * 
 * @author libratears
 * @version V1.0
 */
public class RegSingleton {

	/**
     * 登记薄,用来存放所有登记的实例
     */
	private static HashMap<String, Object> _registry = new HashMap<String, Object>();
	
	/**
	 * 在类加载的时候添加一个实例到登记薄
	 */
    static {
        RegSingleton x = new RegSingleton();
        _registry.put(x.getClass().getName(), x);
    }

    /**
     * 受保护的默认构造方法
     */
	protected RegSingleton() {
		System.out.println("RegSingleton initialized");
	}

	/**
	 * @Title: getInstance
	 * @Description: 静态工厂方法,返回指定登记对象的唯一实例：已登记的，直接取出返回；未登记的,先登记,再取出返回
	 * 
	 * @param name
	 *            要返回类的类名
	 * @return
	 */
	public static RegSingleton getInstance(String name) {
		if (name == null) {
			name = "com.libratears.pattern.creational.singleton.RegSingleton";
		}
		if (_registry.get(name) == null) {
			try {
				_registry.put(name, Class.forName(name).newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return (RegSingleton) _registry.get(name);
	}

}
