package com.logan.singleton;

// 123
/**
 * ����ģʽ
 * @author MRH
 *
 */
public class Singleton {
	
	private Singleton(){
		
	}
	
	private static Singleton singleton = null;
	
	public static Singleton newInstances(){
		if(singleton == null){
			synchronized (Singleton.class) {
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
}
