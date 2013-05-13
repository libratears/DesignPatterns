package com.libratears.pattern.structural.adapter.forObject;

import com.libratears.pattern.structural.adapter.forClass.Adaptee;
import com.libratears.pattern.structural.adapter.forClass.Target;

/**
 * @ClassName: Client
 * @Description: 测试类
 * @date 2013-4-26 下午11:48:31
 * 
 * @author libratears
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Target t = new Adapter(new Adaptee());
		t.request();
	}
}
