package com.wkrzywiec.spring.library.dao;

import java.util.List;

import com.wkrzywiec.spring.library.entity.Author;
import com.wkrzywiec.spring.library.entity.Book;
import com.wkrzywiec.spring.library.entity.BookCategory;
import com.wkrzywiec.spring.library.entity.Borrowed;
import com.wkrzywiec.spring.library.entity.Reserved;

public interface BookDAO {

	Book getBookByGoogleId(String googleId);
	
	Author getAuthorByName(String authorName);
	
	BookCategory getBookCategoryByName(String categoryName);
	
	List<Book> searchBookList(String searchText, int pageNo, int resultsPerPage);
	
	int searchBookResultsCount(String searchText);
	
	Book getBookById(int id);
	
	Book saveBook(Book book, String changedByUsername);

	Book reserveBook(int id, int userId, int days);
	
	boolean isBookReserved(int id);
	
	boolean isBookBorrowed(int id);
	
	int getReservedBooksTotalCountByUser(int userId);
	
	int getBorrowedBooksTotalCountByUser(int userId);
	
	int getReservedBooksTotalCount();
	
	int getBorrowedBooksTotalCount();
	
	List<Reserved> getAllReservedBooks();
	
	List<Borrowed> getAllBorrowedBooks();
}
