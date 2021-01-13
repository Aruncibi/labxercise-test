/**
 * Exercise 2: Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.
 * @author Arun cibi
 *
 */
package com.cg.exceptionhandling;
import java.util.*;
public class Validatename {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
    System.out.println("Enter your fullname");
    String name=scanner.nextLine();
    String []words=name.split("[ ]+");
    int len=words.length;
    try
    {
    	if(len==0)
    		throw new NamenotFoundException();
    	else
    		System.out.println("You entered "+name);
    }
    catch(NamenotFoundException e)
    {
    	System.out.println("There is no name entered");
    }
	}

}
