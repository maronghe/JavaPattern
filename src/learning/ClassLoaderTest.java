package learning;

import java.lang.reflect.InvocationTargetException;

/**
 * parent -> son �ڲ��ṹ����Ϲ�ϵ�����Ǽ̳���ʵ�ֵ�
 * 
 * Bootstrap Class Loader (C++)-> Extensions Class Loader (Java)-> Application
 * Class Loader (Java)-> User-Defined Class Loader (Java)
 * 
 * ˫��ί�л��ƣ� ��һ���ಢ��Ҫ���غ���ʱ����ί���ϼ���������ֱ������Bootstrap Class Loader
 * ���û�еĻ��������Զ�����������أ���������Ŀ���Ǳ�֤�˺��Ŀ����Ͱ�ȫ�����ö���java.lang.Object��
 * 
 * Tomcat������������������෴��
 * ˫��ί�л�����Ȼ��֤�˰�ȫ�����ǲ����
 * 
 * 
 * @author MRH
 *
 */
public class ClassLoaderTest {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException {
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader().getParent());
		System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent()); // c++ JAVA_HOME/jre/lib/rt.jar

		System.out.println(System.getProperty("java.class.path"));
	
		System.out.println("----------");
		String str = "test";
		System.out.println(str.getClass().getClassLoader());
		System.out.println(str);
	
		//loader class test
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		Class clazz = loader.loadClass("learning.TestA");
		clazz.getMethod("sayHello", null).invoke(clazz.newInstance(), null);
	
	
	}
}


class TestA{
	
	public void sayHello(){
		System.out.println("Hello A..");
	}
	
}
