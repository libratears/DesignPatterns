package com.libratears.pattern.behavioral.state;

/** 
 * @ClassName: ConcreteStateA 
 * @Description: 具体状态角色
 * @date 2013-5-16 下午11:59:28 
 * 
 * @author libratears
 * @version V1.0  
 */
public class ConcreteStateB implements State {

    /**
     * @see com.libratears.pattern.behavioral.state.State#handle()
     */
    public void handle() {
        System.out.println("State B");
    }

}
