package com.logan.proxy.staticProxy;

public class StarProxy implements Star{

	private Star star;
	
	public StarProxy(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("StarProxy.confer()");
	}

	@Override
	public void signContract() {
		System.out.println("StarProxy.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("StarProxy.bookTicket()");
	}

	@Override
	public void singing() {
		this.confer();
		this.signContract();
		this.bookTicket();
		star.singing();
		this.collectMoney();
	}

	@Override
	public void collectMoney() {
		System.out.println("StarProxy.collectMoney()");
	}

}
