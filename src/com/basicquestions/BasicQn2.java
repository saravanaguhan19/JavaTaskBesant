package com.basicquestions;

public class BasicQn2 {
	public static double HexagonArea(double side ) {
		return (3*Math.sqrt(3)*(side*side))/2;
	}
	
	public static void main(String[] args) {
		System.out.println(HexagonArea(5.0));
	}
}
