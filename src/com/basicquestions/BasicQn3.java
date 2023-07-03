package com.basicquestions;

public class BasicQn3 {
	
	public static boolean isTriangle(int side1 ,int side2 , int side3 ) {
		if(((side1+side2) >= side3)|| ((side2+side3) >= side1)||((side1+side3) >= side2)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		if(isTriangle(7, 10, 5)) {
			System.out.println("the given sides form a triangle");
		}else {
			System.out.println("the given sides does not form a triangle");
		}
	}
}
