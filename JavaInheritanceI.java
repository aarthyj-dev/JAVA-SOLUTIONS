/**
 * CONCEPT: Inheritance (IS-A Relationship)
 * ---------------------------------------
 * Inheritance is a key pillar of Object-Oriented Programming (OOP). 
 * It allows a subclass (Bird) to inherit the methods and fields 
 * of a superclass (Animal) using the 'extends' keyword.
 * 
 * PROBLEM: 
 * Add a 'sing' method to the Bird class and call it in main so the 
 * output displays walking, flying, and singing.
 * 
 * LINK: https://www.hackerrank.com
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal
{
	void fly()
    {
		System.out.println("I am flying");
	}
  
  //--Start of the solution 
  void sing()
  {
        System.out.println("I am singing");
  }
}
//--End of the solution

public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
    bird.sing();
	
   }
}
