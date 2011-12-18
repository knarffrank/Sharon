package com.itsol.exception;

public class ProfileExistException extends RuntimeException{

	public ProfileExistException(String msg){
		super(msg);
	}
}
