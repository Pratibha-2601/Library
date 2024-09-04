package DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import model.Book;

public class BookDAOImpl implements BookDAO{
	static Map<Integer, Book> map = new HashMap<>();
	
	static {
		map.put(101, new Book(1001, "Java", "AB", "PQR"));
		map.put(102, new Book(1002, "C", "AB", "RST"));
		map.put(103, new Book(1003, "C++", "EF", "TUV"));
		map.put(104, new Book(1004, "Python", "GH", "VWX"));
		map.put(105, new Book(1005, "R", "IJ", "XYZ"));
	}

	@Override
	public Book add(String title, String author, String publisher) {
		// TODO Auto-generated method stub
		Set<Integer> keyset = map.keySet();
		int maxbid = Collections.max(keyset);
		int newbid = maxbid + 1;
		Book b = new Book((maxbid + 1), title, author, publisher);
		map.put(newbid,  b);
		return b;
	}

	@Override
	public Book find(int bid) {
		// TODO Auto-generated method stub
		return map.get(bid);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		Collection<Book> values = map.values();
		List<Book> list = new ArrayList<>(values);
		return list;
	}

	@Override
	public Book update(int bid, Book book) {
		// TODO Auto-generated method stub
		if(!map.containsKey(bid)) throw new RuntimeException("Book does not exist");
		map.put(bid, book);
		return book;
	}

	@Override
	public List<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> list = new ArrayList<>();
		for(Book b : map.values()) {
			if(b.getAuthor().contains(author)) {
				list.add(b);
		}
		}
//		for(Map.Entry<Integer, Book> entry : map.entrySet()) {//for(Book b : map.values())
//			Book b = entry.getValue();
//			if(b.getAuthor().equals(author)) {
//				list.add(b);
//			}
//		}
		return list;
//		Collection<Book> values = map.values().
//		values.removeIf(bk -> !bk.getAuthor().equals(author));
//		return new ArrayList<>(values);
	}

	@Override
	public boolean remove(int bid) {
		// TODO Auto-generated method stub
		if(map.containsKey(bid)) {
			map.remove(bid);
			return true;
		}
		return false;
	}
	
}
