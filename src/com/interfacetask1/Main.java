package com.interfacetask1;

public class Main {
	public static void main(String[] args) {
		

		Airplane airplane = new Airplane();
		airplane.flyObj();
		
		Helicopter helicopter = new Helicopter();
		helicopter.flyObj();
		
		Spacecraft spacecraft = new Spacecraft();
		spacecraft.flyObj();
	}
}
