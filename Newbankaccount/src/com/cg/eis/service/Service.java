/**
 * Exercise 2:	create packages and classes as given below:
 * @author Arun cibi
 *
 */
package com.cg.eis.service;
public class Service implements Employeeservice{
	private String id;
	private String name;
	private double salary;
	private String designation;
	private String insurancescheme;
	public void setId(String id)
	{
	this.id=id;
	}
	public void setName(String name)
	{
	this.name=name;
	}
	public void setSalary(double salary)
	{
	this.salary=salary;
	}
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	public String getDesignation()
	{
		return designation;
	}

public String Insurancescheme(double salary,String designation){
	if(salary<7000 || designation.equals("a1"))
		this.insurancescheme="Workers’ compensation insurance";
	else
		this.insurancescheme="Product liability insurance";
	return insurancescheme;
}
@Override
public String Insurancescheme() {
	// TODO Auto-generated method stub
	return null;
}
}
