package com.inheritence;

public class Main {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.parentMethod();
		//this will call the method of parent class.
		
		
		Parent parentchild = new Child();
		parentchild.parentMethod();
		//here Parent class reference variable holds a object of child class hence
		//this will call the overridden method which is in child class.
		
	}

}
