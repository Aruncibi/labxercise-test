package com.cg.exceptionhandling;

public class SalaryException extends Exception {
	private static final long serialVersionUID = 1L;
    public SalaryException()
    {
    	super("Salary exception occured");
    }
}
