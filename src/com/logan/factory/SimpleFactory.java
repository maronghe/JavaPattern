package com.logan.factory;

/**
 * SimpleFactroy demo
 * @author MRH
 *
 */
public class SimpleFactory {
	
	public Car createCar(String carName){
		if("benci".equals(carName)){
			return new BenciFactory();
		}else if("audi".equals(carName)){
			return new AudiFactory();
		}else{
			return null;
		}
		
	}
}
