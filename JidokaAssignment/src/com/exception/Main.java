package com.exception;

public class Main {
	
	public static void main(String[] args) {
		
		Exception exception = new Exception();
		
		exception.calculateScore(1, "Rohit");
		
		exception.divideScoreByZero(5);
		
		exception.printCricketerName("null");
	}

}
