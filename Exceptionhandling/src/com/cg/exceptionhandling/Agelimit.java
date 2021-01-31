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
	    String name=scanner.nextLine();
	    System.out.println("Enter your age");
    	int age=scanner.nextInt();
    	System.out.println("Enter salary");
    	double salary=scanner.nextDouble();
        String []words=name.split("[ ]+");
    	int len=words.length;
    try
    {
    	if(age<=15)
    		throw new AgelimitException();
    	if(salary<3000)
    		throw new SalaryException();
    	if(len==0)
    		throw new NamenotFoundException();
    	else
    		   System.out.println(name+" "+salary+" "+age);
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
}
}