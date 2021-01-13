/**
 * Exercise 3:  Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.
 * @author Arun cibi
 *
 */
package com.cg.eis.exception;
import java.util.*;
public class Validatesalary {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
    System.out.println("Enter Employee name");
    String name=scanner.next();
    System.out.print("Enter employee salary");
    double salary=scanner.nextDouble();
    try
    {
    	if(salary<3000)
    		throw new EmployeeException();
    	else
    		System.out.println("Employee anme is "+name+ " and salary is "+salary);
    }
    catch(EmployeeException e)
    {
    	System.out.println("Salary exception occured");
    }
	}

}
