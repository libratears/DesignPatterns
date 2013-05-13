package com.libratears.pattern.structural.proxy;

/** 
 * @ClassName: Proxy 
 * @Description: 扒层皮的代理
 * @date 2013-5-14 上午1:00:00 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Proxy implements Subject {
    
    /**
     * 持有的真正干活的类
     */
    private RealSubject _realSubject;
    
    /**
     * @see com.libratears.pattern.structural.proxy.Subject#request()
     */
    public int request() {
        _realSubject = new RealSubject();
		int costOfProxy = 10;
        int cost = _realSubject.request();
        return cost + costOfProxy;
    }

}
