package com.logan.singleton;

public class Singleton3 {
	private Singleton3() {
	}

	public static Singleton3 getInstance() {

		return Inner.singleton3;
	}

	static class Inner {
		private static Singleton3 singleton3 = new Singleton3();
	}
}
