package com.abstractiontask1;

public class Lion extends Animal{
	
	public void eat() {
		System.out.println(" Lion eats");
	}
	
	public void sleep() {
		System.out.println(" Lion sleeps");
	}
	
	public static void main(String[] args) {
		Lion obj = new Lion();
		
		obj.sleep();
		obj.eat();
	}
}
