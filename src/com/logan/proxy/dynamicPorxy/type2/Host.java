package com.logan.proxy.dynamicPorxy.type2;

public class Host implements RentHouse {

	private String name;

	public Host(String name) {
		super();
		this.name = name;
	}

	@Override
	public void finePeople() {
		// TODO Auto-generated method stub

	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("--����-" + this.name + "-���ⷿ�ݣ�");
	}

	@Override
	public String sayHello(String world) {
		return "Hello," + this.name + " , " + world;
	}

}
