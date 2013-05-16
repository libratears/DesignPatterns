package com.libratears.pattern.behavioral.strategy;

/** 
 * @ClassName: Context 
 * @Description: 环境角色，持有一个Strategy的引用
 * @date 2013-5-17 上午12:09:15 
 * 
 * @author libratears
 * @version V1.0  
 */
public class Context {
    
    /**
     * 持有的策略对象
     */
    private Strategy _strategy;
    
    /**
     * 用于初始化持有的对象
     * @param strategy 实例化的策略对象
     */
    public Context(Strategy strategy){
        _strategy = strategy;
    }
    
    /**
     * 设置持有的对象
     * @param _strategy 实例化的策略对象
     */
    public void setStrategy(Strategy _strategy) {
        this._strategy = _strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface(){
        _strategy.algorithmInterface();
    }
    
}
