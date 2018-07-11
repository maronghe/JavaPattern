package com.logan.adapter;

/**
 * Adapter
 * 
 * @author MRH
 *
 */
public class Adapter implements Target{

	private KeyBoard keyBoard;
	
	public Adapter(KeyBoard keyBoard) {
		super();
		this.keyBoard = keyBoard;
	}

	@Override
	public void handleRequest() {
		keyBoard.coding();
	}
	
}
