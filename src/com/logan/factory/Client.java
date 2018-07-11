package com.logan.factory;


/**
 * This is a pattern of factory.  
 * @author MRH
 *
 */
public class Client {
	public static void main(String[] args) {

		//		new AudiCar().run();
		//		new BenciCar().run();
		
		Car car1 = new AudiFactory();
		car1.run();
		
		Car car2 = new BenciFactory();
		car2.run();
		
		
		Car car3 = new SimpleFactory().createCar("audi");
		car3.run();
		Car car4 = new SimpleFactory().createCar("benci");
		car4.run();
		
	}
}
