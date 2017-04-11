package com.mahendra.library.models;

import java.io.Serializable;

/** Entity class for 'books' table
 * @author mahendra shinde
 *
 */
public class Book implements Serializable {
	private Integer bookId;
	private String title;
	private String description;
	private Character status;

	
	public Book(Integer bookId, String title, String description,
			Character status) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.description = description;
		this.status = status;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
