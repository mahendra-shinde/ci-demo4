package com.mahendra.library.utils;

public class InvalidMemberException extends RuntimeException {

	public InvalidMemberException(String name) {
		super("Member ["+name+"] is not found OR not eligible to get book issued");
	}
	
	public InvalidMemberException(int memberId) {
		super("Member ["+memberId+"] is not found OR not eligible to get book issued");
	}
	
}
