package com.logan.proxy.dynamicPorxy.type2;

public class LianjiaAgent implements RentHouse{

	private Host host;
	
	public LianjiaAgent(Host host) {
		super();
		this.host = host;
	}

	@Override
	public void finePeople() {
		// TODO Auto-generated method stub
		System.out.println("链家-寻找租客");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("链家-签署合同");
	}

	@Override
	public void rent() {
		this.finePeople();
		this.signContract();
		host.rent();
		System.out.println("租赁成功！");
	}

	@Override
	public String sayHello(String world) {
		return "Hello , " + world + " by Agent.";
	}

	
}
