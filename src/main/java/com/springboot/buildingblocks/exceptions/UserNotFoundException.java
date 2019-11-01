package com.springboot.buildingblocks.exceptions;

public class UserNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	private String errorMessage;
	private String message;
	
	public UserNotFoundException(String errorMessage, String message) {
		super();
		this.errorMessage = errorMessage;
		this.message = message;
	}

	public UserNotFoundException(String arg0) {
		super(arg0);
	}
	
	
}
