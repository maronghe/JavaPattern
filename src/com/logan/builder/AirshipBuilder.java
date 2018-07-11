package com.logan.builder;

public interface AirshipBuilder {
	
	OrbitalModule builderOrbitalModule();
	
	Engine builderEngine();
	
	EscapeTower builderEscapeTower();
}
