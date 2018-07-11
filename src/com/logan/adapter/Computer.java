package com.logan.adapter;

/**
 * Tester
 * 
 * @author MRH
 *
 */
public class Computer {

	public void doIt(Target target) {
		target.handleRequest();
	}

	public static void main(String[] args) {

		Computer myTP = new Computer();

		KeyBoard keyBoard = new KeyBoard();

		Target target = new Adapter(keyBoard);

		myTP.doIt(target);

	}

}
