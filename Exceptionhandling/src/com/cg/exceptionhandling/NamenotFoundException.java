package com.cg.exceptionhandling;

public class NamenotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public NamenotFoundException() {
    	super("There is no name entered");
    }
}
