package com.exception;

public class Exception {
	
	int score;
	
	String name;
	
	//if score is less than zero one exception will occur at run time scoreshouldnotnegatvie.
	public void calculateScore(int score, String name) throws scoreshouldnotnegatvie{
		if(score<0) {
			throw new scoreshouldnotnegatvie("Score should not be in negative");
		}
		System.out.println(name + "'s score is " + " " +score);
	}
	
	//if any number divided by zero ArithmeticException will occur and we are handling this 
	//using try catch block.
	public void divideScoreByZero(int score){
		
		try{
			int divide = score/0;
			
		}catch (ArithmeticException e) {
			System.out.println("exception is handeled" + " " +e.getMessage());
		}
		
	}
	
	public void printCricketerName(String name){
		
		
		try{
			System.out.println(name.toString());
			
		}catch (NullPointerException e) {
			System.out.println("exception is handeled" + " "+e.getMessage());
		}
		
	}

}
