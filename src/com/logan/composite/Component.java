package com.logan.composite;

/**
 * 
 * 组合模式 ：适用于树状结构，  
 * @author MRH
 *
 */
public interface Component {
	void opertaion();
}
//叶子组件
interface Leaf extends Component{
	
}
//容器组件
interface Composite extends Component{
	void add(Component component);
	void remove(Component component);
	Component getChild(int index);
}
