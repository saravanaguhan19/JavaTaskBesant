package com.abstractiontask1;

public class Tiger extends Animal {
	
	
	public void eat() {
		System.out.println("Tiger eats");
	}
	
	
	public void sleep() {
		System.out.println("Tiger sleeps");
	}
	
	public static void main(String[] args) {
		Tiger obj = new Tiger();
		
		obj.eat();
		obj.sleep();
	}
}
