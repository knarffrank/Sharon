package com.itsol.exception;

public class RoleExistException extends RuntimeException{

	public RoleExistException(String msg){
		super(msg);
	}
}
