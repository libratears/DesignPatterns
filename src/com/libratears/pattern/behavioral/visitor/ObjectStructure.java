package com.libratears.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * @ClassName: ObjectStructure 
 * @Description: 结构对象角色
 * @date 2013-5-17 上午12:32:33 
 * 
 * @author libratears
 * @version V1.0  
 */
public class ObjectStructure {
    
    /**
     * 持有的元素的聚集
     */
    private List<Element> _elements;
    
    /**
     * 初始化元素的聚集
     */
    public ObjectStructure(){
        _elements = new ArrayList<Element>();
    }
    
    /**
     * 执行访问操作
     * @param visitor
     */
    public void action(Visitor visitor){
        Iterator<Element> it = _elements.iterator();
        while (it.hasNext()){
            Element e = it.next();
			e.accept(visitor);
        }
    }
    
    /**
     * 增加一个新的元素
     * @param el 新的元素
     */
    public void add(Element el){
        _elements.add(el);
    }

}
