package com.logan.builder;

/**
 *  Airship class
 * @author MRH
 *
 */
public class Airship {
	
	/**
	 * 轨道舱
	 */
	private OrbitalModule orbitalModule;
	
	/**
	 * 发动机
	 */
	private Engine engine;
	
	/**
	 * 逃离舱
	 */
	private EscapeTower escapeTower;
	
	public Airship(){
		
	}
	/**
	 *  Constructor with fields
	 * @param orbitalModule
	 * @param engine
	 * @param escapeTower
	 */
	public Airship(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
		super();
		this.orbitalModule = orbitalModule;
		this.engine = engine;
		this.escapeTower = escapeTower;
	}

	@Override
	public String toString() {
		return "Airship [orbitalModule=" + orbitalModule + ", engine=" + engine + ", escapeTower=" + escapeTower + "]";
	}
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
	
}
