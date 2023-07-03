package com.polymorphismtask2;

public class Rugby extends Sports {
	
	public void play() {
		System.out.println("play Rugby");

	}
	
	public static void main(String[] args) {
		Rugby obj = new Rugby();
		
		obj.play();
	}

}
