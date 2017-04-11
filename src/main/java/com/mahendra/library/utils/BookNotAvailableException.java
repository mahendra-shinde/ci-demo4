package com.mahendra.library.utils;

public class BookNotAvailableException extends RuntimeException {

	public BookNotAvailableException(int bookId) {
		super("Book "+bookId+" is not available");
	}

	public BookNotAvailableException(String title) {
		super("Book "+title+" is not available");
	}

}
