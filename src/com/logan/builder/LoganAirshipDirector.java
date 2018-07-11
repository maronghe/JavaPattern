package com.logan.builder;


public class LoganAirshipDirector implements AirshipDirector{

	private AirshipBuilder builder;
	
	@Override
	public Airship directorAirship() {
		
		return new Airship(builder.builderOrbitalModule() 
				, builder.builderEngine(), builder.builderEscapeTower());
	}

	public LoganAirshipDirector(AirshipBuilder builder) {
		super();
		this.builder = builder;
	}
	

}
