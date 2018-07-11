package com.logan.proxy.dynamicPorxy.type2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {
	
	// hold the object
	private RentHouse host;
	
	public InvocationHandlerImpl(RentHouse host) {
		super();
		this.host = host;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("");
		System.out.println("==========");
		System.out.println(method.getName());
		System.out.println("==========");

		System.out.println("Before----");
		Object obj = method.invoke(host, args);
		System.out.println("After----");

		return obj;
	}

}
