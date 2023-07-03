package com.polymorphismtask1;

public class Triangle extends Shape {
	
	public double calculateArea(double base , double height) {
		
		return 0.5*base*height;
		
	}
	
	public static void main(String[] args) {
		Triangle obj = new Triangle();
		
		System.out.println(obj.calculateArea(5.0 , 7.0));
	}

}
