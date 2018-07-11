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
		System.out.println("����-Ѱ�����");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("����-ǩ���ͬ");
	}

	@Override
	public void rent() {
		this.finePeople();
		this.signContract();
		host.rent();
		System.out.println("���޳ɹ���");
	}

	@Override
	public String sayHello(String world) {
		return "Hello , " + world + " by Agent.";
	}

	
}
