package com.logan.proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		
		Star star = new StarProxy(new RealStar());
//		star.confer();
//		star.signContract();
//		star.bookTicket();
		star.singing();
//		star.collectMoney();
		
		
	}
}
