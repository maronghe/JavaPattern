package com.logan.composite;

/**
 * 
 * ���ģʽ ����������״�ṹ��  
 * @author MRH
 *
 */
public interface Component {
	void opertaion();
}
//Ҷ�����
interface Leaf extends Component{
	
}
//�������
interface Composite extends Component{
	void add(Component component);
	void remove(Component component);
	Component getChild(int index);
}
