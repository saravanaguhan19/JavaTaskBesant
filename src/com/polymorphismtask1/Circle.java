package com.polymorphismtask1;

public class Circle extends Shape {
	
	public double calculateArea(double radius) {
		return Math.PI*radius*radius;
		
	}
	

public static void main(String[] args) {
	 Circle obj  = new Circle();
	 
	 System.out.println(obj.calculateArea(24.5));
}
	
	

}
