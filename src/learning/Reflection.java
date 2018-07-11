package learning;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	private static void test3() {

		long start = System.currentTimeMillis();
		Class clazz = User.class;
		try {
			User u = null;
			try {
				u = (User) clazz.newInstance();
			} catch (InstantiationException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
			@SuppressWarnings("unchecked")
			Method method = clazz.getDeclaredMethod("setName", String.class);
			method.setAccessible(true);
			try {
				for (int i = 0; i < 1000000; i++) {
					//u.setName(null);
					method.invoke(u, "");
				}
				
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println(diff+"ms");
		
	}

	private static void test2() {
		long start = System.currentTimeMillis();
		Class clazz = User.class;
		try {
			User u = null;
			try {
				u = (User) clazz.newInstance();
			} catch (InstantiationException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
			@SuppressWarnings("unchecked")
			Method method = clazz.getDeclaredMethod("setName", String.class);
			try {
				for (int i = 0; i < 1000000; i++) {
					//u.setName(null);
					method.invoke(u, "");
				}
				
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println(diff+"ms");
	}

	private static void test1() {

		User u = new User();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			u.setName(null);
		}
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println(diff+"ms");
		
	
	}
}

class User{
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}
