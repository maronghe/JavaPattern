package com.logan.factory;

/**
 * ÂÖÌ¥
 * @author MRH
 *
 */
public interface LunTai {
	public void luntai();
}

class HaoLunTai implements LunTai {

	@Override
	public void luntai() {
		System.out.println("hao lun tai, good");
	}

}

class CiLunTai implements LunTai {

	@Override
	public void luntai() {
		System.out.println("ci lun tai, bad ");
	}

}