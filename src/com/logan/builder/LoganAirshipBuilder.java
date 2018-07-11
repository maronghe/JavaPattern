package com.logan.builder;

public class LoganAirshipBuilder implements AirshipBuilder{

	@Override
	public OrbitalModule builderOrbitalModule() {
		return new OrbitalModule("Logan's Orbital Module.");
	}

	@Override
	public Engine builderEngine() {
		return new Engine("Logan's Engine.");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		return new EscapeTower("Logan's Escape Tower.");
	}

}
