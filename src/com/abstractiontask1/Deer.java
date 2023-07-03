package com.abstractiontask1;

public class Deer extends Animal {

	public void eat() {
		System.out.println("Deer eats");
	}
	
	
	public void sleep() {
		System.out.println("Deer sleeps");
	}
	
	public static void main(String[] args) {
		Deer obj = new Deer();
		
		obj.eat();
		obj.sleep();
	}
}
