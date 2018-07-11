package com.logan.factory;

public interface Zuoyi {
	public void zuoyi();
}

class HaoZuoyi implements Zuoyi {

	@Override
	public void zuoyi() {
		System.out.println("hao zuo yi , shi yong shi jian chang .");
	}

}

class CiZuoyi implements Zuoyi {

	@Override
	public void zuoyi() {
		System.out.println("ci zuo yi , shi yong shi jian duan .");
	}

}