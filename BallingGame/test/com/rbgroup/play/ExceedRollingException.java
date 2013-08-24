package com.rbgroup.play;

public class ExceedRollingException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //Question To Professor 

	public ExceedRollingException(int number) {
		String message = "exceed rolling time, Entire permitted play count is "+(number-1);
		System.out.println(message);
	}
}
