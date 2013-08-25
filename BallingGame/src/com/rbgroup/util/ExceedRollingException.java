package com.rbgroup.util;

public class ExceedRollingException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //Question To Professor 

	public ExceedRollingException(int capacity) {
		String message = "exceed rolling time, Entire permitted play count is "+capacity;
		System.out.println(message);
	}
}
