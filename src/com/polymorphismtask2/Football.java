package com.polymorphismtask2;

public class Football  extends Sports {
	
	public void play() {
		System.out.println("play Football");

	}
	public static void main(String[] args) {
		Football obj = new Football();
		
		obj.play();
	}

}
