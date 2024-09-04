package service;

import java.util.List;

import model.Book;

public interface BookService {
	Book add(String title, String author, String publisher);
	Book update(int bid, Book book);
	Book find(int bid);
	boolean remove(int bid);
	List<Book> findByAuthor(String author);
	List<Book> findAll();
}
