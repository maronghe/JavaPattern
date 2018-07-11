package com.logan.proxy.dynamicPorxy.type2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		// real object
		RentHouse host = new Host("Logan");
		
		InvocationHandler handler = new InvocationHandlerImpl(host);
		
		RentHouse rent = (RentHouse) Proxy.newProxyInstance(host.getClass().getClassLoader(),
				host.getClass().getInterfaces(), handler);
		
		rent.rent();
		System.out.println(rent.sayHello("∞°åç¥Úåçµƒ"));
	}
}
