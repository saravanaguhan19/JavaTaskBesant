package com.polymorphismtask2;

public class Basketball  extends Sports{
	
	public void play() {
		System.out.println("play Basketball");

	}
	public static void main(String[] args) {
		Basketball obj = new Basketball();
		
		obj.play();
	}
}
