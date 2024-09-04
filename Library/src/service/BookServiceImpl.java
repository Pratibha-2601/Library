package service;

import java.util.List;

import DAO.BookDAO;
import DAO.BookDAOImpl;
import model.Book;

public class BookServiceImpl implements BookService{

	BookDAO bookDAO = new BookDAOImpl();
	@Override
	public Book add(String title, String author, String publisher) {
		// TODO Auto-generated method stub
		return bookDAO.add(title, author, publisher);
	}

	@Override
	public Book update(int bid, Book book) {
		// TODO Auto-generated method stub
		return bookDAO.update(bid, book);
	}

	@Override
	public Book find(int bid) {
		// TODO Auto-generated method stub
		return bookDAO.find(bid);
	}

	@Override
	public List<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDAO.findByAuthor(author);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookDAO.findAll();
	}

	@Override
	public boolean remove(int bid) {
		// TODO Auto-generated method stub
		return bookDAO.remove(bid);
	}

}
