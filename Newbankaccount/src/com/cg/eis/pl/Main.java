/**
 * Exercise 2:	create packages and classes as given below:
 * @author Arun cibi
 *
 */
package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.service.Service;
public class Main {
static Scanner scanner;
public static void main(String[] args) {
scanner = new Scanner(System.in);
Service obj = new Service();
//int n=scanner.nextInt();
System.out.print("Enter Id");
String id=scanner.next();
obj.setId(id);
System.out.print("Enter name");
String name=scanner.next();
obj.setName(name);
System.out.print("Enter salary");
double salary=scanner.nextDouble();
obj.setSalary(salary);
System.out.print("Enter designation");
String designation=scanner.next();
obj.setDesignation(designation);
obj.Insurancescheme(salary,designation);
		System.out.print("Employee details : Id-" +obj.getId()+" Name-"+obj.getName()+" Salary-"+obj.getSalary()+" Designation-"+obj.getDesignation()+ " insurancescheme-"+ obj.Insurancescheme(salary, designation));
	}

}
