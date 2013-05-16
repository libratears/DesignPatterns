package com.libratears.pattern.behavioral.state;

/** 
 * @ClassName: State 
 * @Description: 抽象状态角色
 * @date 2013-5-16 下午11:58:13 
 * 
 * @author libratears
 * @version V1.0  
 */
public interface State {
    
    /**
     * @Title: Handle
     * @Description: 不同状态的相应接口
     *
     */
    void handle();

}
