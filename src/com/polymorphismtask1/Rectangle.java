package com.polymorphismtask1;

public class Rectangle  extends Shape{
	
	public double calculateArea(double length , double breath) {
		
		
		return length * breath;
		
	}
	
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		
		System.out.println(obj.calculateArea(12.0, 22.0));
	}
	

}
