/**
 * Exercise 1:  Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
 * @author Arun cibi
 *
 */
package com.cg.exceptionhandling;
import java.util.*;
public class Agelimit{
    static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    //Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter your name");
	    String name=scanner.next();
	    System.out.println("Enter your age");
    	int age=scanner.nextInt();
    try
    {
    	if(age<=15)
    		throw new AgelimitException();
    	else
    		   System.out.println(name+"'s age is "+age);
    }
    catch(AgelimitException e)
    {
    	System.out.println("You have entered the invalid age");
    }
}
}