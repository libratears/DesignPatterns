package com.libratears.pattern.structural.proxy;

/** 
 * @ClassName: Client 
 * @Description: 测试类
 * @date 2013-5-14 上午1:01:00 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Client {

    public static void main(String[] args) {
        Subject shaobing = new Proxy();
        System.out.println(shaobing.request());
    }
}
