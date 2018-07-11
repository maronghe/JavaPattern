package com.logan.builder;

/**
 * This is a pattern of builder.
 * @author MRH
 *
 */
public class Client {
	
	public static void main(String[] args) {
		AirshipDirector director = new LoganAirshipDirector(new LoganAirshipBuilder());
		Airship airship = director.directorAirship();
		System.out.println(airship);
	}
}
