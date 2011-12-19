package com.itsol.exception;

public class UserExistException extends RuntimeException{

	public UserExistException(String msg){
		super(msg);
	}
}
