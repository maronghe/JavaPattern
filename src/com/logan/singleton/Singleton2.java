package com.logan.singleton;

public class Singleton2 {
	private Singleton2(){
//		System.out.println(singleton);
	}

	private static Singleton2 singleton = new Singleton2();

	public static Singleton2 getInstances(){
		
		return singleton;
	}
}
