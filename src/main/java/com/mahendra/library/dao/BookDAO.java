/**
 * 
 */
package com.mahendra.library.dao;

import java.io.Serializable;

import com.mahendra.library.models.Book;

/** DAO Interface for Books
 * @author mahendra shinde
 *
 */
public interface BookDAO {
	 int save(Book book);
	 Book findById(int id);
	 
}
