package learning;

import java.lang.reflect.InvocationTargetException;

/**
 * parent -> son 内部结构是组合关系，不是继承来实现的
 * 
 * Bootstrap Class Loader (C++)-> Extensions Class Loader (Java)-> Application
 * Class Loader (Java)-> User-Defined Class Loader (Java)
 * 
 * 双亲委托机制： 定一个类并想要加载后它时，会委托上级加载器，直到顶端Bootstrap Class Loader
 * 如果没有的话，才让自定义加载器加载，这样做的目的是保证了核心库类型安全。不让定义java.lang.Object类
 * 
 * Tomcat服务器类加载器与其相反。
 * 双亲委托机制虽然保证了安全，但是不灵活
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
