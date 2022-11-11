/**
 *
 * @author lidija
 * <------- STEP 9 : OVERRIDE FUNCTIONS IN DAO ------->
 */

package com.teamsix.book.persistence;

import java.util.Collection;

import com.teamsix.book.database.BookDatabase;
import com.teamsix.book.entity.Book;


public class BookDaoImpl implements BookDao {

	@Override
	public Collection<Book> getAllRecords() {
		
		return BookDatabase.getBookList().values();
	}

	@Override
	public Book searchRecord(int id) {
		
		return BookDatabase.getBookList().get(id);
	}

	@Override
	public Book insertRecord(Book book) {
	
		return BookDatabase.getBookList().put(book.getBookId(), book);
	}
    
}




